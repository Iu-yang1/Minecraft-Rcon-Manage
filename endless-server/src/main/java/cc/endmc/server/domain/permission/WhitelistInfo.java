package cc.endmc.server.domain.permission;

import cc.endmc.common.annotation.Excel;
import cc.endmc.common.core.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;
import java.util.List;

/**
 * 白名单对象 whitelist_info
 *
 * @author ruoyi
 * @date 2023-12-26
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WhitelistInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 封禁ID
     */
    private Long banId;

    /**
     * 申请时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "申请时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date time;

    /**
     * 游戏名称
     */
    @Excel(name = "游戏名称")
    private String userName;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userUuid;

    /**
     * 正版标识
     */
    @Excel(name = "正版标识")
    private Long onlineFlag;

    /**
     * 用户QQ号
     */
    @Excel(name = "用户QQ号")
    private String qqNum;

    /**
     * 审核用户
     */
    @Excel(name = "审核用户")
    private String reviewUsers;

    /**
     * 审核状态
     */
    @Excel(name = "审核状态")
    private String status;

    /**
     * 添加状态
     */
    @Excel(name = "添加状态")
    private String addState;

    /**
     * 添加时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "添加时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date addTime;

    /**
     * 移除原因
     */
    @Excel(name = "移除原因")
    private String removeReason;

    /**
     * 移除时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "移除时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date removeTime;

    @Excel(name = "服务器ID")
    private String servers;

    /**
     * 是否被封禁
     */
    private String banFlag;

    /**
     * 封禁原因
     */
    private String bannedReason;

    @Excel(name = "更新用户")
    private String updateBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @Excel(name = "封禁状态")
    private Long banState;

    @Excel(name = "封禁原因")
    private String banReason;

    /**
     * 白名单时限信息
     */
    List<WhitelistDeadlineInfo> whitelistDeadlineInfos;

    /**
     * 开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date startTime;

    /**
     * 截止时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date endTime;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("time", getTime())
                .append("userName", getUserName())
                .append("userUuid", getUserUuid())
                .append("onlineFlag", getOnlineFlag())
                .append("qqNum", getQqNum())
                .append("reviewUsers", getReviewUsers())
                .append("status", getStatus())
                .append("addState", getAddState())
                .append("addTime", getAddTime())
                .append("removeReason", getRemoveReason())
                .append("removeTime", getRemoveTime())
                .append("servers", getServers())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("banFlag", getBanFlag())
                .append("bannedReason", getBannedReason())
                .append("banState", getBanState())
                .append("banReason", getBanReason())
                .toString();
    }
}
