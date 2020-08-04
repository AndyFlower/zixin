package com.cul.culsite.dao;

import com.cul.culsite.dto.MPointsPurseDTO;
import com.cul.culsite.dto.MPointsPurseDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MPointsPurseDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_PURSE
     *
     * @mbggenerated
     */
    int countByExample(MPointsPurseDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_PURSE
     *
     * @mbggenerated
     */
    int deleteByExample(MPointsPurseDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_PURSE
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String purseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_PURSE
     *
     * @mbggenerated
     */
    int insert(MPointsPurseDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_PURSE
     *
     * @mbggenerated
     */
    int insertSelective(MPointsPurseDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_PURSE
     *
     * @mbggenerated
     */
    List<MPointsPurseDTO> selectByExample(MPointsPurseDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_PURSE
     *
     * @mbggenerated
     */
    MPointsPurseDTO selectByPrimaryKey(String purseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_PURSE
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MPointsPurseDTO record, @Param("example") MPointsPurseDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_PURSE
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MPointsPurseDTO record, @Param("example") MPointsPurseDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_PURSE
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MPointsPurseDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_PURSE
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MPointsPurseDTO record);
}