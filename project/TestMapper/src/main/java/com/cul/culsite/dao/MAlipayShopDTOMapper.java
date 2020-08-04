package com.cul.culsite.dao;

import com.cul.culsite.dto.MAlipayShopDTO;
import com.cul.culsite.dto.MAlipayShopDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MAlipayShopDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ALIPAY_SHOP
     *
     * @mbggenerated
     */
    int countByExample(MAlipayShopDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ALIPAY_SHOP
     *
     * @mbggenerated
     */
    int deleteByExample(MAlipayShopDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ALIPAY_SHOP
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String shopSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ALIPAY_SHOP
     *
     * @mbggenerated
     */
    int insert(MAlipayShopDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ALIPAY_SHOP
     *
     * @mbggenerated
     */
    int insertSelective(MAlipayShopDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ALIPAY_SHOP
     *
     * @mbggenerated
     */
    List<MAlipayShopDTO> selectByExample(MAlipayShopDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ALIPAY_SHOP
     *
     * @mbggenerated
     */
    MAlipayShopDTO selectByPrimaryKey(String shopSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ALIPAY_SHOP
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MAlipayShopDTO record, @Param("example") MAlipayShopDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ALIPAY_SHOP
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MAlipayShopDTO record, @Param("example") MAlipayShopDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ALIPAY_SHOP
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MAlipayShopDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ALIPAY_SHOP
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MAlipayShopDTO record);
}