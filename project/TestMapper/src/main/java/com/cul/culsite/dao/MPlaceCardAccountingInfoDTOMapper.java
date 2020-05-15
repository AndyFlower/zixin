package com.cul.culsite.dao;

import com.cul.culsite.dto.MPlaceCardAccountingInfoDTO;
import com.cul.culsite.dto.MPlaceCardAccountingInfoDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MPlaceCardAccountingInfoDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PLACE_CARD_ACCOUNTING_INFO
     *
     * @mbggenerated
     */
    int countByExample(MPlaceCardAccountingInfoDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PLACE_CARD_ACCOUNTING_INFO
     *
     * @mbggenerated
     */
    int deleteByExample(MPlaceCardAccountingInfoDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PLACE_CARD_ACCOUNTING_INFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PLACE_CARD_ACCOUNTING_INFO
     *
     * @mbggenerated
     */
    int insert(MPlaceCardAccountingInfoDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PLACE_CARD_ACCOUNTING_INFO
     *
     * @mbggenerated
     */
    int insertSelective(MPlaceCardAccountingInfoDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PLACE_CARD_ACCOUNTING_INFO
     *
     * @mbggenerated
     */
    List<MPlaceCardAccountingInfoDTO> selectByExample(MPlaceCardAccountingInfoDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PLACE_CARD_ACCOUNTING_INFO
     *
     * @mbggenerated
     */
    MPlaceCardAccountingInfoDTO selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PLACE_CARD_ACCOUNTING_INFO
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MPlaceCardAccountingInfoDTO record, @Param("example") MPlaceCardAccountingInfoDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PLACE_CARD_ACCOUNTING_INFO
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MPlaceCardAccountingInfoDTO record, @Param("example") MPlaceCardAccountingInfoDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PLACE_CARD_ACCOUNTING_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MPlaceCardAccountingInfoDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PLACE_CARD_ACCOUNTING_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MPlaceCardAccountingInfoDTO record);
}