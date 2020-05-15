package com.cul.culsite.dao;

import com.cul.culsite.dto.MCloudIssuerSubjectInfoDTO;
import com.cul.culsite.dto.MCloudIssuerSubjectInfoDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MCloudIssuerSubjectInfoDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CLOUD_ISSUER_SUBJECT_INFO
     *
     * @mbggenerated
     */
    int countByExample(MCloudIssuerSubjectInfoDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CLOUD_ISSUER_SUBJECT_INFO
     *
     * @mbggenerated
     */
    int deleteByExample(MCloudIssuerSubjectInfoDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CLOUD_ISSUER_SUBJECT_INFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CLOUD_ISSUER_SUBJECT_INFO
     *
     * @mbggenerated
     */
    int insert(MCloudIssuerSubjectInfoDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CLOUD_ISSUER_SUBJECT_INFO
     *
     * @mbggenerated
     */
    int insertSelective(MCloudIssuerSubjectInfoDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CLOUD_ISSUER_SUBJECT_INFO
     *
     * @mbggenerated
     */
    List<MCloudIssuerSubjectInfoDTO> selectByExample(MCloudIssuerSubjectInfoDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CLOUD_ISSUER_SUBJECT_INFO
     *
     * @mbggenerated
     */
    MCloudIssuerSubjectInfoDTO selectByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CLOUD_ISSUER_SUBJECT_INFO
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MCloudIssuerSubjectInfoDTO record, @Param("example") MCloudIssuerSubjectInfoDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CLOUD_ISSUER_SUBJECT_INFO
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MCloudIssuerSubjectInfoDTO record, @Param("example") MCloudIssuerSubjectInfoDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CLOUD_ISSUER_SUBJECT_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MCloudIssuerSubjectInfoDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CLOUD_ISSUER_SUBJECT_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MCloudIssuerSubjectInfoDTO record);
}