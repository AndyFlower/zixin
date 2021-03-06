package com.cul.culsite.dao;

import com.cul.culsite.dto.MShelfProduct;
import com.cul.culsite.dto.MShelfProductCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MShelfProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    int countByExample(MShelfProductCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    int deleteByExample(MShelfProductCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String spid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    int insert(MShelfProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    int insertSelective(MShelfProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    List<MShelfProduct> selectByExample(MShelfProductCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    MShelfProduct selectByPrimaryKey(String spid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MShelfProduct record, @Param("example") MShelfProductCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MShelfProduct record, @Param("example") MShelfProductCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MShelfProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_SHELF_PRODUCT
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MShelfProduct record);
}