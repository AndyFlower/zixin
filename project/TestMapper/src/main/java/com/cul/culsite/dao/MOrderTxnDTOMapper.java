package com.cul.culsite.dao;

import com.cul.culsite.dto.MOrderTxnDTO;
import com.cul.culsite.dto.MOrderTxnDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MOrderTxnDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ORDER_TXN
     *
     * @mbggenerated
     */
    int countByExample(MOrderTxnDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ORDER_TXN
     *
     * @mbggenerated
     */
    int deleteByExample(MOrderTxnDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ORDER_TXN
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String motTxnId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ORDER_TXN
     *
     * @mbggenerated
     */
    int insert(MOrderTxnDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ORDER_TXN
     *
     * @mbggenerated
     */
    int insertSelective(MOrderTxnDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ORDER_TXN
     *
     * @mbggenerated
     */
    List<MOrderTxnDTO> selectByExample(MOrderTxnDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ORDER_TXN
     *
     * @mbggenerated
     */
    MOrderTxnDTO selectByPrimaryKey(String motTxnId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ORDER_TXN
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MOrderTxnDTO record, @Param("example") MOrderTxnDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ORDER_TXN
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MOrderTxnDTO record, @Param("example") MOrderTxnDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ORDER_TXN
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MOrderTxnDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ORDER_TXN
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MOrderTxnDTO record);
}