package com.slp.mybatis;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName MIssuerParaDTOMapper
 * @Description TODO
 * @Author zishen
 * @Date 2020/5/21 8:40
 * @Version 1.0
 **/
public interface MIssuerParaDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_PARA
     *
     * @mbggenerated
     */
    int countByExample(MIssuerParaDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_PARA
     *
     * @mbggenerated
     */
    int deleteByExample(MIssuerParaDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_PARA
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String issuerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_PARA
     *
     * @mbggenerated
     */
    int insert(MIssuerParaDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_PARA
     *
     * @mbggenerated
     */
    int insertSelective(MIssuerParaDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_PARA
     *
     * @mbggenerated
     */
    List<MIssuerParaDTO> selectByExample(MIssuerParaDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_PARA
     *
     * @mbggenerated
     */
    MIssuerParaDTO selectByPrimaryKey(String issuerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_PARA
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MIssuerParaDTO record, @Param("example") MIssuerParaDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_PARA
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MIssuerParaDTO record, @Param("example") MIssuerParaDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_PARA
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MIssuerParaDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_ISSUER_PARA
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MIssuerParaDTO record);
}
