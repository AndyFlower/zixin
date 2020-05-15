package com.cul.culsite.dao.expand;

import com.cul.culsite.dto.MMemberDTO;

public interface MemberMapper {

    /**
     * 根据主键添加特定会员的行锁
     *
     * @mbggenerated
     */
    public MMemberDTO addTransactionByMemberId(String memberId);

}