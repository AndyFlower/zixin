package com.cul.culsite.dao;

import com.cul.culsite.dto.MCorpKeyFileDTO;
import com.cul.culsite.dto.MCorpKeyFileDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MCorpKeyFileDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CORP_KEY_FILE
     *
     * @mbggenerated
     */
    int countByExample(MCorpKeyFileDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CORP_KEY_FILE
     *
     * @mbggenerated
     */
    int deleteByExample(MCorpKeyFileDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CORP_KEY_FILE
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String corpCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CORP_KEY_FILE
     *
     * @mbggenerated
     */
    int insert(MCorpKeyFileDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CORP_KEY_FILE
     *
     * @mbggenerated
     */
    int insertSelective(MCorpKeyFileDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CORP_KEY_FILE
     *
     * @mbggenerated
     */
    List<MCorpKeyFileDTO> selectByExample(MCorpKeyFileDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CORP_KEY_FILE
     *
     * @mbggenerated
     */
    MCorpKeyFileDTO selectByPrimaryKey(String corpCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CORP_KEY_FILE
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MCorpKeyFileDTO record, @Param("example") MCorpKeyFileDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CORP_KEY_FILE
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MCorpKeyFileDTO record, @Param("example") MCorpKeyFileDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CORP_KEY_FILE
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MCorpKeyFileDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CORP_KEY_FILE
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MCorpKeyFileDTO record);
}