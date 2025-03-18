<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row>
                        <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="名称" prop="mingcheng">
          <el-input v-model="ruleForm.mingcheng" 
              placeholder="名称" clearable  :readonly="ro.mingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="名称" prop="mingcheng">
              <el-input v-model="ruleForm.mingcheng" 
                placeholder="名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="工号" prop="gonghao">
          <el-input v-model="ruleForm.gonghao" 
              placeholder="工号" clearable  :readonly="ro.gonghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="工号" prop="gonghao">
              <el-input v-model="ruleForm.gonghao" 
                placeholder="工号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="真实姓名" prop="zhenshixingming">
          <el-input v-model="ruleForm.zhenshixingming" 
              placeholder="真实姓名" clearable  :readonly="ro.zhenshixingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="真实姓名" prop="zhenshixingming">
              <el-input v-model="ruleForm.zhenshixingming" 
                placeholder="真实姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="性别" prop="xingbie">
          <el-input v-model="ruleForm.xingbie" 
              placeholder="性别" clearable  :readonly="ro.xingbie"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="性别" prop="xingbie">
              <el-input v-model="ruleForm.xingbie" 
                placeholder="性别" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="出生日期" prop="chushengriqi">
          <el-input v-model="ruleForm.chushengriqi" 
              placeholder="出生日期" clearable  :readonly="ro.chushengriqi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="出生日期" prop="chushengriqi">
              <el-input v-model="ruleForm.chushengriqi" 
                placeholder="出生日期" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling" 
              placeholder="年龄" clearable  :readonly="ro.nianling"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="年龄" prop="nianling">
              <el-input v-model="ruleForm.nianling" 
                placeholder="年龄" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="政治面貌" prop="zhengzhimianmao">
          <el-input v-model="ruleForm.zhengzhimianmao" 
              placeholder="政治面貌" clearable  :readonly="ro.zhengzhimianmao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="政治面貌" prop="zhengzhimianmao">
              <el-input v-model="ruleForm.zhengzhimianmao" 
                placeholder="政治面貌" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="民族" prop="minzu">
          <el-input v-model="ruleForm.minzu" 
              placeholder="民族" clearable  :readonly="ro.minzu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="民族" prop="minzu">
              <el-input v-model="ruleForm.minzu" 
                placeholder="民族" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="联系方式" prop="lianxifangshi">
          <el-input v-model="ruleForm.lianxifangshi" 
              placeholder="联系方式" clearable  :readonly="ro.lianxifangshi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="联系方式" prop="lianxifangshi">
              <el-input v-model="ruleForm.lianxifangshi" 
                placeholder="联系方式" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="城市" prop="chengshi">
          <el-input v-model="ruleForm.chengshi" 
              placeholder="城市" clearable  :readonly="ro.chengshi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="城市" prop="chengshi">
              <el-input v-model="ruleForm.chengshi" 
                placeholder="城市" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="所在单位" prop="suozaidanwei">
          <el-input v-model="ruleForm.suozaidanwei" 
              placeholder="所在单位" clearable  :readonly="ro.suozaidanwei"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="所在单位" prop="suozaidanwei">
              <el-input v-model="ruleForm.suozaidanwei" 
                placeholder="所在单位" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="职务" prop="zhiwu">
          <el-input v-model="ruleForm.zhiwu" 
              placeholder="职务" clearable  :readonly="ro.zhiwu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="职务" prop="zhiwu">
              <el-input v-model="ruleForm.zhiwu" 
                placeholder="职务" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="工龄" prop="gongling">
          <el-input v-model="ruleForm.gongling" 
              placeholder="工龄" clearable  :readonly="ro.gongling"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="工龄" prop="gongling">
              <el-input v-model="ruleForm.gongling" 
                placeholder="工龄" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="申请职称" prop="shenqingzhicheng">
          <el-input v-model="ruleForm.shenqingzhicheng" 
              placeholder="申请职称" clearable  :readonly="ro.shenqingzhicheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="申请职称" prop="shenqingzhicheng">
              <el-input v-model="ruleForm.shenqingzhicheng" 
                placeholder="申请职称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="24">  
        <el-form-item class="upload" v-if="type!='info'" label="申请文件" prop="shenqingwenjian">
          <file-upload
          tip="点击上传申请文件"
          action="file/upload"
          :limit="1"
          :multiple="true"
          :fileUrls="ruleForm.shenqingwenjian?ruleForm.shenqingwenjian:''"
          @change="shenqingwenjianUploadChange"
          ></file-upload>
        </el-form-item>  
        <div v-else>
          <el-form-item v-if="ruleForm.shenqingwenjian" label="申请文件" prop="shenqingwenjian">
            <el-button type="text" size="small" @click="download(ruleForm.shenqingwenjian)">下载</el-button>
          </el-form-item>
        </div>    
      </el-col>      
                                    <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="申请日期" prop="shenqingriqi">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.shenqingriqi" 
                type="date"
                placeholder="申请日期">
            </el-date-picker> 
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.shenqingriqi" label="申请日期" prop="shenqingriqi">
              <el-input v-model="ruleForm.shenqingriqi" 
                placeholder="申请日期" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                              </el-row>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  <el-form-item class="btn">
                <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    
    
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"#DCDFE6","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"4px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"#606266","addEditBoxColor":"#fff","dateIconFontSize":"14px","btnSaveBgColor":"rgba(117, 113, 249, 1)","uploadIconFontColor":"#8c939d","textareaBorderColor":"#DCDFE6","btnCancelBgColor":"#ecf5ff","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"#606266","dateBorderColor":"#DCDFE6","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"4px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"#DCDFE6","inputBorderColor":"#DCDFE6","uploadBorderColor":"#DCDFE6","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"1px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"rgba(117, 113, 249, 1)","btnSaveBorderWidth":"1px"},
      id: '',
      type: '',
      ro:{
	mingcheng : false,
	gonghao : false,
	zhenshixingming : false,
	xingbie : false,
	chushengriqi : false,
	nianling : false,
	zhengzhimianmao : false,
	minzu : false,
	lianxifangshi : false,
	chengshi : false,
	suozaidanwei : false,
	zhiwu : false,
	gongling : false,
	shenqingzhicheng : false,
	shenqingwenjian : false,
	shenqingriqi : false,
      },
            ruleForm: {
                	        mingcheng: '',
	                        	        gonghao: '',
	                        	        zhenshixingming: '',
	                        	        xingbie: '',
	                        	        chushengriqi: '',
	                        	        nianling: '',
	                        	        zhengzhimianmao: '',
	                        	        minzu: '',
	                        	        lianxifangshi: '',
	                        	        chengshi: '',
	                        	        suozaidanwei: '',
	                        	        zhiwu: '',
	                        	        gongling: '',
	                        	        shenqingzhicheng: '',
	                        	        shenqingwenjian: '',
	                        	        shenqingriqi: '',
	                      },
                                                                                                                                                                                                                                            rules: {
                  mingcheng: [
                            { required: true, message: '名称不能为空', trigger: 'blur' },
                                    	                                                              ],
                  gonghao: [
                                    	                                                              ],
                  zhenshixingming: [
                                    	                                                              ],
                  xingbie: [
                                    	                                                              ],
                  chushengriqi: [
                                    	                                                              ],
                  nianling: [
                                    	                                                              ],
                  zhengzhimianmao: [
                                    	                                                              ],
                  minzu: [
                                    	                                                              ],
                  lianxifangshi: [
                                    	                                                              ],
                  chengshi: [
                                    	                                                              ],
                  suozaidanwei: [
                                    	                                                              ],
                  zhiwu: [
                                    	                                                              ],
                  gongling: [
                                    	                                                              ],
                  shenqingzhicheng: [
                            { required: true, message: '申请职称不能为空', trigger: 'blur' },
                                    	                                                              ],
                  shenqingwenjian: [
                            { required: true, message: '申请文件不能为空', trigger: 'blur' },
                                    	                                                              ],
                  shenqingriqi: [
                                    	                                                              ],
              }
    };
  },
  props: ["parent"],
  computed: {
                                                                                                                                                                                                      },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
        // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          	            if(o=='mingcheng'){
            this.ruleForm.mingcheng = obj[o];
	    this.ro.mingcheng = true;
            continue;
          }
	            	            if(o=='gonghao'){
            this.ruleForm.gonghao = obj[o];
	    this.ro.gonghao = true;
            continue;
          }
	            	            if(o=='zhenshixingming'){
            this.ruleForm.zhenshixingming = obj[o];
	    this.ro.zhenshixingming = true;
            continue;
          }
	            	            if(o=='xingbie'){
            this.ruleForm.xingbie = obj[o];
	    this.ro.xingbie = true;
            continue;
          }
	            	            if(o=='chushengriqi'){
            this.ruleForm.chushengriqi = obj[o];
	    this.ro.chushengriqi = true;
            continue;
          }
	            	            if(o=='nianling'){
            this.ruleForm.nianling = obj[o];
	    this.ro.nianling = true;
            continue;
          }
	            	            if(o=='zhengzhimianmao'){
            this.ruleForm.zhengzhimianmao = obj[o];
	    this.ro.zhengzhimianmao = true;
            continue;
          }
	            	            if(o=='minzu'){
            this.ruleForm.minzu = obj[o];
	    this.ro.minzu = true;
            continue;
          }
	            	            if(o=='lianxifangshi'){
            this.ruleForm.lianxifangshi = obj[o];
	    this.ro.lianxifangshi = true;
            continue;
          }
	            	            if(o=='chengshi'){
            this.ruleForm.chengshi = obj[o];
	    this.ro.chengshi = true;
            continue;
          }
	            	            if(o=='suozaidanwei'){
            this.ruleForm.suozaidanwei = obj[o];
	    this.ro.suozaidanwei = true;
            continue;
          }
	            	            if(o=='zhiwu'){
            this.ruleForm.zhiwu = obj[o];
	    this.ro.zhiwu = true;
            continue;
          }
	            	            if(o=='gongling'){
            this.ruleForm.gongling = obj[o];
	    this.ro.gongling = true;
            continue;
          }
	            	            if(o=='shenqingzhicheng'){
            this.ruleForm.shenqingzhicheng = obj[o];
	    this.ro.shenqingzhicheng = true;
            continue;
          }
	            	            if(o=='shenqingwenjian'){
            this.ruleForm.shenqingwenjian = obj[o];
	    this.ro.shenqingwenjian = true;
            continue;
          }
	            	            if(o=='shenqingriqi'){
            this.ruleForm.shenqingriqi = obj[o];
	    this.ro.shenqingriqi = true;
            continue;
          }
	                    }
                                                                                                                                                                                                                                                                              }
            // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
                                            		if(json.gonghao!=''&&json.gonghao){
              		this.ruleForm.gonghao = json.gonghao
		}
                                  		if(json.zhenshixingming!=''&&json.zhenshixingming){
              		this.ruleForm.zhenshixingming = json.zhenshixingming
		}
                                  		if(json.xingbie!=''&&json.xingbie){
              		this.ruleForm.xingbie = json.xingbie
		}
                                  		if(json.chushengriqi!=''&&json.chushengriqi){
              		this.ruleForm.chushengriqi = json.chushengriqi
		}
                                  		if(json.nianling!=''&&json.nianling){
              		this.ruleForm.nianling = json.nianling
		}
                                  		if(json.zhengzhimianmao!=''&&json.zhengzhimianmao){
              		this.ruleForm.zhengzhimianmao = json.zhengzhimianmao
		}
                                  		if(json.minzu!=''&&json.minzu){
              		this.ruleForm.minzu = json.minzu
		}
                                  		if(json.lianxifangshi!=''&&json.lianxifangshi){
              		this.ruleForm.lianxifangshi = json.lianxifangshi
		}
                                  		if(json.chengshi!=''&&json.chengshi){
              		this.ruleForm.chengshi = json.chengshi
		}
                                  		if(json.suozaidanwei!=''&&json.suozaidanwei){
              		this.ruleForm.suozaidanwei = json.suozaidanwei
		}
                                  		if(json.zhiwu!=''&&json.zhiwu){
              		this.ruleForm.zhiwu = json.zhiwu
		}
                                  		if(json.gongling!=''&&json.gongling){
              		this.ruleForm.gongling = json.gongling
		}
                                                                                                } else {
          this.$message.error(data.msg);
        }
      });
                                                                                                                                                                                                                                                                                                                              },
                                                                                                                                        // 多级联动参数
                                                                                                                                                                            info(id) {
      this.$http({
        url: `zizhushenbao/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.ruleForm = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });
    },
        // 提交
    onSubmit() {
                  // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                                                                                                                                                                                                                                                                                                                                    this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `zizhushenbao/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.zizhushenbaoCrossAddOrUpdateFlag = false;
                  this.parent.search();
                  this.parent.contentStyleChange();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.zizhushenbaoCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
                                                                                                                                                                                                shenqingwenjianUploadChange(fileUrls) {
                this.ruleForm.shenqingwenjian = fileUrls;
				this.addEditUploadStyleChange()
            },
                        	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
}
.btn .el-button {
  padding: 0;
}
</style>
