/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.oa.controller;

import cn.zhuatech.oa.common.ApiResponse;
import cn.zhuatech.oa.service.SealUseGovernanceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/enterprise/oa")
public class SealUseGovernanceController {
    private final SealUseGovernanceService service;
    public SealUseGovernanceController(SealUseGovernanceService service) { this.service = service; }
    @PostMapping("/seal-use")
    public ApiResponse<SealUseGovernanceService.Assessment> assess(@Valid @RequestBody SealUseGovernanceService.Request request) {
        return ApiResponse.ok("用印治理评估完成", service.assess(request));
    }
}
