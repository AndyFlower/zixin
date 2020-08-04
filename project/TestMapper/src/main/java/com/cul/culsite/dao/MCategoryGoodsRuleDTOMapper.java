package com.cul.culsite.dao;

import com.cul.culsite.dto.MCategoryGoodsRuleDTO;
import com.cul.culsite.dto.MCategoryGoodsRuleDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MCategoryGoodsRuleDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CATEGORY_GOODS_RULE
     *
     * @mbggenerated
     */
    int countByExample(MCategoryGoodsRuleDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CATEGORY_GOODS_RULE
     *
     * @mbggenerated
     */
    int deleteByExample(MCategoryGoodsRuleDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CATEGORY_GOODS_RULE
     *
     * @mbggenerated
     */
    int insert(MCategoryGoodsRuleDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CATEGORY_GOODS_RULE
     *
     * @mbggenerated
     */
    int insertSelective(MCategoryGoodsRuleDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CATEGORY_GOODS_RULE
     *
     * @mbggenerated
     */
    List<MCategoryGoodsRuleDTO> selectByExample(MCategoryGoodsRuleDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CATEGORY_GOODS_RULE
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MCategoryGoodsRuleDTO record, @Param("example") MCategoryGoodsRuleDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CATEGORY_GOODS_RULE
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MCategoryGoodsRuleDTO record, @Param("example") MCategoryGoodsRuleDTOCriteria example);
}