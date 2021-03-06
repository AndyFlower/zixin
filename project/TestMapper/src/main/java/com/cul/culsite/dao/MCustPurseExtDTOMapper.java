package com.cul.culsite.dao;

import com.cul.culsite.dto.MCustPurseExtDTO;
import com.cul.culsite.dto.MCustPurseExtDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MCustPurseExtDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CUST_PURSE_EXT
     *
     * @mbggenerated
     */
    int countByExample(MCustPurseExtDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CUST_PURSE_EXT
     *
     * @mbggenerated
     */
    int deleteByExample(MCustPurseExtDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CUST_PURSE_EXT
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String purseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CUST_PURSE_EXT
     *
     * @mbggenerated
     */
    int insert(MCustPurseExtDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CUST_PURSE_EXT
     *
     * @mbggenerated
     */
    int insertSelective(MCustPurseExtDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CUST_PURSE_EXT
     *
     * @mbggenerated
     */
    List<MCustPurseExtDTO> selectByExample(MCustPurseExtDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CUST_PURSE_EXT
     *
     * @mbggenerated
     */
    MCustPurseExtDTO selectByPrimaryKey(String purseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CUST_PURSE_EXT
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MCustPurseExtDTO record, @Param("example") MCustPurseExtDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CUST_PURSE_EXT
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MCustPurseExtDTO record, @Param("example") MCustPurseExtDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CUST_PURSE_EXT
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MCustPurseExtDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CUST_PURSE_EXT
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MCustPurseExtDTO record);
}