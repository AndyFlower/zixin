package com.cul.culsite.dao;

import com.cul.culsite.dto.MReduceActivityDTO;
import com.cul.culsite.dto.MReduceActivityDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MReduceActivityDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REDUCE_ACTIVITY
     *
     * @mbggenerated
     */
    int countByExample(MReduceActivityDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REDUCE_ACTIVITY
     *
     * @mbggenerated
     */
    int deleteByExample(MReduceActivityDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REDUCE_ACTIVITY
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String mraId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REDUCE_ACTIVITY
     *
     * @mbggenerated
     */
    int insert(MReduceActivityDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REDUCE_ACTIVITY
     *
     * @mbggenerated
     */
    int insertSelective(MReduceActivityDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REDUCE_ACTIVITY
     *
     * @mbggenerated
     */
    List<MReduceActivityDTO> selectByExample(MReduceActivityDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REDUCE_ACTIVITY
     *
     * @mbggenerated
     */
    MReduceActivityDTO selectByPrimaryKey(String mraId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REDUCE_ACTIVITY
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MReduceActivityDTO record, @Param("example") MReduceActivityDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REDUCE_ACTIVITY
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MReduceActivityDTO record, @Param("example") MReduceActivityDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REDUCE_ACTIVITY
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MReduceActivityDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_REDUCE_ACTIVITY
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MReduceActivityDTO record);
}