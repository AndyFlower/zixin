package com.cul.culsite.dao;

import com.cul.culsite.dto.MGoodsDTO;
import com.cul.culsite.dto.MGoodsDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MGoodsDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int countByExample(MGoodsDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int deleteByExample(MGoodsDTOCriteria example);

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
    int insert(MGoodsDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int insertSelective(MGoodsDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    List<MGoodsDTO> selectByExample(MGoodsDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    MGoodsDTO selectByPrimaryKey(String mgcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MGoodsDTO record, @Param("example") MGoodsDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MGoodsDTO record, @Param("example") MGoodsDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MGoodsDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_GOODS_CAT
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MGoodsDTO record);
}