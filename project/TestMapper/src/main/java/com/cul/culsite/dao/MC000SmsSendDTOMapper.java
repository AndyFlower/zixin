package com.cul.culsite.dao;

import com.cul.culsite.dto.MC000SmsSendDTO;
import com.cul.culsite.dto.MC000SmsSendDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MC000SmsSendDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_C000_SMS_SEND
     *
     * @mbggenerated
     */
    int countByExample(MC000SmsSendDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_C000_SMS_SEND
     *
     * @mbggenerated
     */
    int deleteByExample(MC000SmsSendDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_C000_SMS_SEND
     *
     * @mbggenerated
     */
    int insert(MC000SmsSendDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_C000_SMS_SEND
     *
     * @mbggenerated
     */
    int insertSelective(MC000SmsSendDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_C000_SMS_SEND
     *
     * @mbggenerated
     */
    List<MC000SmsSendDTO> selectByExample(MC000SmsSendDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_C000_SMS_SEND
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MC000SmsSendDTO record, @Param("example") MC000SmsSendDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_C000_SMS_SEND
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MC000SmsSendDTO record, @Param("example") MC000SmsSendDTOCriteria example);
}