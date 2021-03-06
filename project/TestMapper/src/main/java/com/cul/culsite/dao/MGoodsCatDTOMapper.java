package com.cul.culsite.dao;

import com.cul.culsite.dto.MGoodsCatDTO;
import com.cul.culsite.dto.MGoodsCatDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MGoodsCatDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int countByExample(MGoodsCatDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int deleteByExample(MGoodsCatDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String mgcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int insert(MGoodsCatDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int insertSelective(MGoodsCatDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    List<MGoodsCatDTO> selectByExample(MGoodsCatDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    MGoodsCatDTO selectByPrimaryKey(String mgcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MGoodsCatDTO record, @Param("example") MGoodsCatDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MGoodsCatDTO record, @Param("example") MGoodsCatDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MGoodsCatDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MGoodsCatDTO record);
}