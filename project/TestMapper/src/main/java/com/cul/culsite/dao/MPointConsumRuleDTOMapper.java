package com.cul.culsite.dao;

import com.cul.culsite.dto.MPointConsumRuleDTO;
import com.cul.culsite.dto.MPointConsumRuleDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MPointConsumRuleDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINT_CONSUM_RULE
     *
     * @mbggenerated
     */
    int countByExample(MPointConsumRuleDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINT_CONSUM_RULE
     *
     * @mbggenerated
     */
    int deleteByExample(MPointConsumRuleDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINT_CONSUM_RULE
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINT_CONSUM_RULE
     *
     * @mbggenerated
     */
    int insert(MPointConsumRuleDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINT_CONSUM_RULE
     *
     * @mbggenerated
     */
    int insertSelective(MPointConsumRuleDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINT_CONSUM_RULE
     *
     * @mbggenerated
     */
    List<MPointConsumRuleDTO> selectByExample(MPointConsumRuleDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINT_CONSUM_RULE
     *
     * @mbggenerated
     */
    MPointConsumRuleDTO selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINT_CONSUM_RULE
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MPointConsumRuleDTO record, @Param("example") MPointConsumRuleDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINT_CONSUM_RULE
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MPointConsumRuleDTO record, @Param("example") MPointConsumRuleDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINT_CONSUM_RULE
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MPointConsumRuleDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINT_CONSUM_RULE
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MPointConsumRuleDTO record);
}