package com.cul.culsite.dao;

import com.cul.culsite.dto.MSystemParamDTO;
import com.cul.culsite.dto.MSystemParamDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MSystemParamDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SYSTEM_PARAM
     *
     * @mbggenerated
     */
    int countByExample(MSystemParamDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SYSTEM_PARAM
     *
     * @mbggenerated
     */
    int deleteByExample(MSystemParamDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SYSTEM_PARAM
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String paramId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SYSTEM_PARAM
     *
     * @mbggenerated
     */
    int insert(MSystemParamDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SYSTEM_PARAM
     *
     * @mbggenerated
     */
    int insertSelective(MSystemParamDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SYSTEM_PARAM
     *
     * @mbggenerated
     */
    List<MSystemParamDTO> selectByExample(MSystemParamDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SYSTEM_PARAM
     *
     * @mbggenerated
     */
    MSystemParamDTO selectByPrimaryKey(String paramId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SYSTEM_PARAM
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MSystemParamDTO record, @Param("example") MSystemParamDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SYSTEM_PARAM
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MSystemParamDTO record, @Param("example") MSystemParamDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SYSTEM_PARAM
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MSystemParamDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SYSTEM_PARAM
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MSystemParamDTO record);
}