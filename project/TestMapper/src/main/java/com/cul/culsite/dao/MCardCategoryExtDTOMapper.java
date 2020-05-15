package com.cul.culsite.dao;

import com.cul.culsite.dto.MCardCategoryExtDTO;
import com.cul.culsite.dto.MCardCategoryExtDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MCardCategoryExtDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARD_CATEGORY_EXT
     *
     * @mbggenerated
     */
    int countByExample(MCardCategoryExtDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARD_CATEGORY_EXT
     *
     * @mbggenerated
     */
    int deleteByExample(MCardCategoryExtDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARD_CATEGORY_EXT
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String categoryNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARD_CATEGORY_EXT
     *
     * @mbggenerated
     */
    int insert(MCardCategoryExtDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARD_CATEGORY_EXT
     *
     * @mbggenerated
     */
    int insertSelective(MCardCategoryExtDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARD_CATEGORY_EXT
     *
     * @mbggenerated
     */
    List<MCardCategoryExtDTO> selectByExample(MCardCategoryExtDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARD_CATEGORY_EXT
     *
     * @mbggenerated
     */
    MCardCategoryExtDTO selectByPrimaryKey(String categoryNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARD_CATEGORY_EXT
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MCardCategoryExtDTO record, @Param("example") MCardCategoryExtDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARD_CATEGORY_EXT
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MCardCategoryExtDTO record, @Param("example") MCardCategoryExtDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARD_CATEGORY_EXT
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MCardCategoryExtDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARD_CATEGORY_EXT
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MCardCategoryExtDTO record);
}