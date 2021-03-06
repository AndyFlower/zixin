package com.cul.culsite.dao;

import com.cul.culsite.dto.MMerGroupRelDTO;
import com.cul.culsite.dto.MMerGroupRelDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MMerGroupRelDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_MER_GROUP_REL
     *
     * @mbggenerated
     */
    int countByExample(MMerGroupRelDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_MER_GROUP_REL
     *
     * @mbggenerated
     */
    int deleteByExample(MMerGroupRelDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_MER_GROUP_REL
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_MER_GROUP_REL
     *
     * @mbggenerated
     */
    int insert(MMerGroupRelDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_MER_GROUP_REL
     *
     * @mbggenerated
     */
    int insertSelective(MMerGroupRelDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_MER_GROUP_REL
     *
     * @mbggenerated
     */
    List<MMerGroupRelDTO> selectByExample(MMerGroupRelDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_MER_GROUP_REL
     *
     * @mbggenerated
     */
    MMerGroupRelDTO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_MER_GROUP_REL
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MMerGroupRelDTO record, @Param("example") MMerGroupRelDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_MER_GROUP_REL
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MMerGroupRelDTO record, @Param("example") MMerGroupRelDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_MER_GROUP_REL
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MMerGroupRelDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_MER_GROUP_REL
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MMerGroupRelDTO record);
}