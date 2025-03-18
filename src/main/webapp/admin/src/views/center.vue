<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                              <el-col :span="12">
        <el-form-item   v-if="flag=='yishengzhuanjia'"  label="工号" prop="gonghao">
          <el-input v-model="ruleForm.gonghao" readonly              placeholder="工号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='yishengzhuanjia'"  label="昵称" prop="nicheng">
          <el-input v-model="ruleForm.nicheng"               placeholder="昵称" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yishengzhuanjia'"  label="真实姓名" prop="zhenshixingming">
          <el-input v-model="ruleForm.zhenshixingming"               placeholder="真实姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='yishengzhuanjia'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in yishengzhuanjiaxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="flag=='yishengzhuanjia'" label="出生日期" prop="chushengriqi">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.chushengriqi" 
                type="date"
                placeholder="出生日期">
            </el-date-picker> 
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yishengzhuanjia'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yishengzhuanjia'"  label="政治面貌" prop="zhengzhimianmao">
          <el-input v-model="ruleForm.zhengzhimianmao"               placeholder="政治面貌" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yishengzhuanjia'"  label="民族" prop="minzu">
          <el-input v-model="ruleForm.minzu"               placeholder="民族" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yishengzhuanjia'"  label="联系方式" prop="lianxifangshi">
          <el-input v-model="ruleForm.lianxifangshi"               placeholder="联系方式" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yishengzhuanjia'"  label="城市" prop="chengshi">
          <el-input v-model="ruleForm.chengshi"               placeholder="城市" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yishengzhuanjia'"  label="所在单位" prop="suozaidanwei">
          <el-input v-model="ruleForm.suozaidanwei"               placeholder="所在单位" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yishengzhuanjia'"  label="职务" prop="zhiwu">
          <el-input v-model="ruleForm.zhiwu"               placeholder="职务" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yishengzhuanjia'"  label="工龄" prop="gongling">
          <el-input v-model="ruleForm.gongling"               placeholder="工龄" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yishengzhuanjia'"  label="简介" prop="jianjie">
          <el-input v-model="ruleForm.jianjie"               placeholder="简介" clearable></el-input>
        </el-form-item>
      </el-col>
                                                <el-col :span="12">
        <el-form-item   v-if="flag=='shiweijiwei'"  label="市卫账号" prop="shiweizhanghao">
          <el-input v-model="ruleForm.shiweizhanghao" readonly              placeholder="市卫账号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='shiweijiwei'"  label="昵称" prop="nicheng">
          <el-input v-model="ruleForm.nicheng"               placeholder="昵称" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='shiweijiwei'"  label="所属城市" prop="suoshuchengshi">
          <el-input v-model="ruleForm.suoshuchengshi"               placeholder="所属城市" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='shiweijiwei'"  label="联系方式" prop="lianxifangshi">
          <el-input v-model="ruleForm.lianxifangshi"               placeholder="联系方式" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='shiweijiwei'"  label="简介" prop="jianjie">
          <el-input v-model="ruleForm.jianjie"               placeholder="简介" clearable></el-input>
        </el-form-item>
      </el-col>
                                                <el-col :span="12">
        <el-form-item   v-if="flag=='shengweijiwei'"  label="省卫账号" prop="shengweizhanghao">
          <el-input v-model="ruleForm.shengweizhanghao" readonly              placeholder="省卫账号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='shengweijiwei'"  label="昵称" prop="nicheng">
          <el-input v-model="ruleForm.nicheng"               placeholder="昵称" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='shengweijiwei'"  label="所属省份" prop="suoshushengfen">
          <el-input v-model="ruleForm.suoshushengfen"               placeholder="所属省份" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='shengweijiwei'"  label="联系方式" prop="lianxifangshi">
          <el-input v-model="ruleForm.lianxifangshi"               placeholder="联系方式" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='shengweijiwei'"  label="简介" prop="jianjie">
          <el-input v-model="ruleForm.jianjie"               placeholder="简介" clearable></el-input>
        </el-form-item>
      </el-col>
                                                                                                                  <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
                                                                              yishengzhuanjiaxingbieOptions: [],
                                                                                                                                                                                                                                                                                                                                                                                                                                        };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                                    this.yishengzhuanjiaxingbieOptions = "男,女".split(',')
                                                                                                                                                                                                                                                                                          },
  methods: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            onUpdateHandler() {
                              if((!this.ruleForm.gonghao)&& 'yishengzhuanjia'==this.flag){
        this.$message.error('工号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'yishengzhuanjia'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                  if((!this.ruleForm.nicheng)&& 'yishengzhuanjia'==this.flag){
        this.$message.error('昵称不能为空');
        return
      }
                                                                  if((!this.ruleForm.zhenshixingming)&& 'yishengzhuanjia'==this.flag){
        this.$message.error('真实姓名不能为空');
        return
      }
                                                                                                                                                                                                                                                                                                                                                                        if( 'yishengzhuanjia' ==this.flag && this.ruleForm.lianxifangshi&&(!isMobile(this.ruleForm.lianxifangshi))){
        this.$message.error(`联系方式应输入手机格式`);
        return
      }
                                                                                                                                                                                                                                                                                                                                                if((!this.ruleForm.shiweizhanghao)&& 'shiweijiwei'==this.flag){
        this.$message.error('市卫账号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'shiweijiwei'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                  if((!this.ruleForm.nicheng)&& 'shiweijiwei'==this.flag){
        this.$message.error('昵称不能为空');
        return
      }
                                                                                                                                                if( 'shiweijiwei' ==this.flag && this.ruleForm.lianxifangshi&&(!isMobile(this.ruleForm.lianxifangshi))){
        this.$message.error(`联系方式应输入手机格式`);
        return
      }
                                                                                                                        if((!this.ruleForm.shengweizhanghao)&& 'shengweijiwei'==this.flag){
        this.$message.error('省卫账号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'shengweijiwei'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                                                                                                                                                      if( 'shengweijiwei' ==this.flag && this.ruleForm.lianxifangshi&&(!isMobile(this.ruleForm.lianxifangshi))){
        this.$message.error(`联系方式应输入手机格式`);
        return
      }
                                                                                                                                                                                          this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
