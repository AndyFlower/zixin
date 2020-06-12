package com.slp.service;

import com.slp.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    /**
     * 事务注解
     * @param userName
     * @param bookId
     * 事务细节：
     * isolation-Isolation:事务隔离级别
     * propagation-Propagation:事务传播特性
     *
     * noRollbackFor-Class[] :哪些异常事务可以不回滚
     * noRollbackForClassName-String[]  :全类名
     *
     * rollbackFor-Class[] :哪些异常事务需要回滚
     * rollbackForClassName-String[]  :全类名
     *
     * 异常分类：
     *        运行时异常（非检查异常）：可以不用处理  ；默认都回滚
     *        编译时异常（受检异常）：需要处理 ； 默认不回滚
     *
     * 事务的回滚：默认发生运行时异常都回滚，发生编译时异常不回滚
     * noRollbackFor:哪些异常事务可以不回滚；可以让原来默认回滚的不回滚
     *              noRollbackFor = {ArithmeticException.class}
     * rollbackFor:原本不回滚的异常让其回滚
     *              rollbackFor = {FileNotFoundException.class}
     *
     * readOnly-boolean:设置事务只读、
     *      可以进行事务优化：
     *      readonly=true 加快查询速度，不用管事务那一块操作
     * timeout-int:超时；事务超出指定时长自动终止并回滚
     *
     *
     * propagation-Propagation:事务传播行为
     *   传播行为（事务的传播+事务的行为）
     *          如果有多个事务进行嵌套操作，子事务是否大事务公用一个事务
     *传播行为：
     * AService{
     *     tx_a(){
     *         tx_b(){
     *         }
     *         tx_c(){
     *         }
     *     }
     * }
     */
    @Transactional(timeout = 3,readOnly = false,noRollbackFor = {ArithmeticException.class},rollbackFor = {FileNotFoundException.class})
    public void checkout(String userName,String bookId){
        //库存
        bookDao.updateStock(bookId);

        //查询价格
        int price = bookDao.getPrice(bookId);
        //更新余额
        bookDao.updateBalance(userName,price);
    }

    /**
     * 调整事务的传播行为
     *  REQUIRED(0),
     *     SUPPORTS(1),
     *     MANDATORY(2),
     *     REQUIRES_NEW(3),
     *     NOT_SUPPORTED(4),
     *     NEVER(5),
     *     NESTED(6);
     * @param bookId
     * @return
     */
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public int getPrice(String bookId){
        return bookDao.getPrice(bookId);
    }

    @Transactional()
    public void updatePrice(String bookId,int price){
         bookDao.updatePrice(bookId,price);
    }

    /**
     * 如果将multx放在这里
     * 将内部两个方法都设置为REQUIRES_NEW
     * 效果：没修改
     */
    @Transactional
    public void mulTx(){
        checkout("Li","001");
        updatePrice("002",98);
        int i=10/0;
    }
}
