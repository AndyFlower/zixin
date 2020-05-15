package com.cul.culsite.dao;

import com.cul.culsite.dto.MParaTemplateDetailDTO;
import com.cul.culsite.dto.MParaTemplateDetailDTOCriteria;
import com.cul.culsite.dto.MParaTemplateDetailDTOKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MParaTemplateDetailDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PARA_TEMPLATE_DETAIL
     *
     * @mbggenerated
     */
    int countByExample(MParaTemplateDetailDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PARA_TEMPLATE_DETAIL
     *
     * @mbggenerated
     */
    int deleteByExample(MParaTemplateDetailDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PARA_TEMPLATE_DETAIL
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(MParaTemplateDetailDTOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PARA_TEMPLATE_DETAIL
     *
     * @mbggenerated
     */
    int insert(MParaTemplateDetailDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PARA_TEMPLATE_DETAIL
     *
     * @mbggenerated
     */
    int insertSelective(MParaTemplateDetailDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PARA_TEMPLATE_DETAIL
     *
     * @mbggenerated
     */
    List<MParaTemplateDetailDTO> selectByExample(MParaTemplateDetailDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PARA_TEMPLATE_DETAIL
     *
     * @mbggenerated
     */
    MParaTemplateDetailDTO selectByPrimaryKey(MParaTemplateDetailDTOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PARA_TEMPLATE_DETAIL
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MParaTemplateDetailDTO record, @Param("example") MParaTemplateDetailDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PARA_TEMPLATE_DETAIL
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MParaTemplateDetailDTO record, @Param("example") MParaTemplateDetailDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PARA_TEMPLATE_DETAIL
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MParaTemplateDetailDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.M_PARA_TEMPLATE_DETAIL
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MParaTemplateDetailDTO record);
}