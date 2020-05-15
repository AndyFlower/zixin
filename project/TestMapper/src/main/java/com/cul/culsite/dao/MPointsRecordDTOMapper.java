package com.cul.culsite.dao;

import com.cul.culsite.dto.MPointsRecordDTO;
import com.cul.culsite.dto.MPointsRecordDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MPointsRecordDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD
     *
     * @mbggenerated
     */
    int countByExample(MPointsRecordDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD
     *
     * @mbggenerated
     */
    int deleteByExample(MPointsRecordDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String txnId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD
     *
     * @mbggenerated
     */
    int insert(MPointsRecordDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD
     *
     * @mbggenerated
     */
    int insertSelective(MPointsRecordDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD
     *
     * @mbggenerated
     */
    List<MPointsRecordDTO> selectByExample(MPointsRecordDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD
     *
     * @mbggenerated
     */
    MPointsRecordDTO selectByPrimaryKey(String txnId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MPointsRecordDTO record, @Param("example") MPointsRecordDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MPointsRecordDTO record, @Param("example") MPointsRecordDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MPointsRecordDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_POINTS_RECORD
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MPointsRecordDTO record);
}