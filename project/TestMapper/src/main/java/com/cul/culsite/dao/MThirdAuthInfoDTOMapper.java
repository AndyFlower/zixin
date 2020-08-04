package com.cul.culsite.dao;

import com.cul.culsite.dto.MThirdAuthInfoDTO;
import com.cul.culsite.dto.MThirdAuthInfoDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MThirdAuthInfoDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_THIRD_AUTH_INFO
     *
     * @mbggenerated
     */
    int countByExample(MThirdAuthInfoDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_THIRD_AUTH_INFO
     *
     * @mbggenerated
     */
    int deleteByExample(MThirdAuthInfoDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_THIRD_AUTH_INFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String appId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_THIRD_AUTH_INFO
     *
     * @mbggenerated
     */
    int insert(MThirdAuthInfoDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_THIRD_AUTH_INFO
     *
     * @mbggenerated
     */
    int insertSelective(MThirdAuthInfoDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_THIRD_AUTH_INFO
     *
     * @mbggenerated
     */
    List<MThirdAuthInfoDTO> selectByExample(MThirdAuthInfoDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_THIRD_AUTH_INFO
     *
     * @mbggenerated
     */
    MThirdAuthInfoDTO selectByPrimaryKey(String appId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_THIRD_AUTH_INFO
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MThirdAuthInfoDTO record, @Param("example") MThirdAuthInfoDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_THIRD_AUTH_INFO
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MThirdAuthInfoDTO record, @Param("example") MThirdAuthInfoDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_THIRD_AUTH_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MThirdAuthInfoDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_THIRD_AUTH_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MThirdAuthInfoDTO record);
}