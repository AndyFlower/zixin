package com.cul.culsite.dao;

import com.cul.culsite.dto.MIssuerShop;
import com.cul.culsite.dto.MIssuerShopCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MIssuerShopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_SHOP
     *
     * @mbggenerated
     */
    int countByExample(MIssuerShopCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_SHOP
     *
     * @mbggenerated
     */
    int deleteByExample(MIssuerShopCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_SHOP
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_SHOP
     *
     * @mbggenerated
     */
    int insert(MIssuerShop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_SHOP
     *
     * @mbggenerated
     */
    int insertSelective(MIssuerShop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_SHOP
     *
     * @mbggenerated
     */
    List<MIssuerShop> selectByExample(MIssuerShopCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_SHOP
     *
     * @mbggenerated
     */
    MIssuerShop selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_SHOP
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MIssuerShop record, @Param("example") MIssuerShopCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_SHOP
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MIssuerShop record, @Param("example") MIssuerShopCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_SHOP
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MIssuerShop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_SHOP
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MIssuerShop record);
}