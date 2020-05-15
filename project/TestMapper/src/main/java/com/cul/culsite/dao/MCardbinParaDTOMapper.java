package com.cul.culsite.dao;

import com.cul.culsite.dto.MCardbinParaDTO;
import com.cul.culsite.dto.MCardbinParaDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MCardbinParaDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARDBIN_PARA
     *
     * @mbggenerated
     */
    int countByExample(MCardbinParaDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARDBIN_PARA
     *
     * @mbggenerated
     */
    int deleteByExample(MCardbinParaDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARDBIN_PARA
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String cardBin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARDBIN_PARA
     *
     * @mbggenerated
     */
    int insert(MCardbinParaDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARDBIN_PARA
     *
     * @mbggenerated
     */
    int insertSelective(MCardbinParaDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARDBIN_PARA
     *
     * @mbggenerated
     */
    List<MCardbinParaDTO> selectByExample(MCardbinParaDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARDBIN_PARA
     *
     * @mbggenerated
     */
    MCardbinParaDTO selectByPrimaryKey(String cardBin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARDBIN_PARA
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MCardbinParaDTO record, @Param("example") MCardbinParaDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARDBIN_PARA
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MCardbinParaDTO record, @Param("example") MCardbinParaDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARDBIN_PARA
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MCardbinParaDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_CARDBIN_PARA
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MCardbinParaDTO record);
}