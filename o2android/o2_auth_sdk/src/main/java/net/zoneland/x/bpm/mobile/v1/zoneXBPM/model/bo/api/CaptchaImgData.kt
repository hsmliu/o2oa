package net.zoneland.x.bpm.mobile.v1.zoneXBPM.model.bo.api

/**
 * Created by fancyLou on 2020-09-27.
 * Copyright © 2020 O2. All rights reserved.
 */


data class CaptchaImgData (
        var id: String = "",
        var image: String = "" //验证码图片的base64
)