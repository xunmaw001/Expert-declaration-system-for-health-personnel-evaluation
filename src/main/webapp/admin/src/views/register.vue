<template>
  <div>
    <div class="container">
      <div class="login-form" style="backgroundColor:rgba(255, 255, 255, 0.26);borderRadius:10px">
        <h1 class="h1" style="color:rgba(255, 255, 255, 1);fontSize:28px;">卫生人员评审专家申报系统注册</h1>
		<el-form ref="rgsForm" class="rgs-form" :model="rgsForm" label-width="120px">
															<!-- <div v-if="tableName=='yishengzhuanjia'" class="input-group">
			   <div class="label">工号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.gonghao" class="input" type="text" placeholder="工号">
			   </div>
			 </div> -->
			<el-form-item label="工号" class="input" v-if="tableName=='yishengzhuanjia'">
			  <el-input v-model="ruleForm.gonghao" autocomplete="off" placeholder="工号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yishengzhuanjia'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='yishengzhuanjia'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yishengzhuanjia'" class="input-group">
			   <div class="label">昵称</div>
			   <div class="input-container">
			     <input v-model="ruleForm.nicheng" class="input" type="text" placeholder="昵称">
			   </div>
			 </div> -->
			<el-form-item label="昵称" class="input" v-if="tableName=='yishengzhuanjia'">
			  <el-input v-model="ruleForm.nicheng" autocomplete="off" placeholder="昵称" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yishengzhuanjia'" class="input-group">
			   <div class="label">真实姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.zhenshixingming" class="input" type="text" placeholder="真实姓名">
			   </div>
			 </div> -->
			<el-form-item label="真实姓名" class="input" v-if="tableName=='yishengzhuanjia'">
			  <el-input v-model="ruleForm.zhenshixingming" autocomplete="off" placeholder="真实姓名" type="text" />
			</el-form-item>
																														<!-- <div v-if="tableName=='yishengzhuanjia'" class="input-group">
			   <div class="label">年龄</div>
			   <div class="input-container">
			     <input v-model="ruleForm.nianling" class="input" type="text" placeholder="年龄">
			   </div>
			 </div> -->
			<el-form-item label="年龄" class="input" v-if="tableName=='yishengzhuanjia'">
			  <el-input v-model="ruleForm.nianling" autocomplete="off" placeholder="年龄" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yishengzhuanjia'" class="input-group">
			   <div class="label">政治面貌</div>
			   <div class="input-container">
			     <input v-model="ruleForm.zhengzhimianmao" class="input" type="text" placeholder="政治面貌">
			   </div>
			 </div> -->
			<el-form-item label="政治面貌" class="input" v-if="tableName=='yishengzhuanjia'">
			  <el-input v-model="ruleForm.zhengzhimianmao" autocomplete="off" placeholder="政治面貌" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yishengzhuanjia'" class="input-group">
			   <div class="label">民族</div>
			   <div class="input-container">
			     <input v-model="ruleForm.minzu" class="input" type="text" placeholder="民族">
			   </div>
			 </div> -->
			<el-form-item label="民族" class="input" v-if="tableName=='yishengzhuanjia'">
			  <el-input v-model="ruleForm.minzu" autocomplete="off" placeholder="民族" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yishengzhuanjia'" class="input-group">
			   <div class="label">联系方式</div>
			   <div class="input-container">
			     <input v-model="ruleForm.lianxifangshi" class="input" type="text" placeholder="联系方式">
			   </div>
			 </div> -->
			<el-form-item label="联系方式" class="input" v-if="tableName=='yishengzhuanjia'">
			  <el-input v-model="ruleForm.lianxifangshi" autocomplete="off" placeholder="联系方式" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yishengzhuanjia'" class="input-group">
			   <div class="label">城市</div>
			   <div class="input-container">
			     <input v-model="ruleForm.chengshi" class="input" type="text" placeholder="城市">
			   </div>
			 </div> -->
			<el-form-item label="城市" class="input" v-if="tableName=='yishengzhuanjia'">
			  <el-input v-model="ruleForm.chengshi" autocomplete="off" placeholder="城市" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yishengzhuanjia'" class="input-group">
			   <div class="label">所在单位</div>
			   <div class="input-container">
			     <input v-model="ruleForm.suozaidanwei" class="input" type="text" placeholder="所在单位">
			   </div>
			 </div> -->
			<el-form-item label="所在单位" class="input" v-if="tableName=='yishengzhuanjia'">
			  <el-input v-model="ruleForm.suozaidanwei" autocomplete="off" placeholder="所在单位" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yishengzhuanjia'" class="input-group">
			   <div class="label">职务</div>
			   <div class="input-container">
			     <input v-model="ruleForm.zhiwu" class="input" type="text" placeholder="职务">
			   </div>
			 </div> -->
			<el-form-item label="职务" class="input" v-if="tableName=='yishengzhuanjia'">
			  <el-input v-model="ruleForm.zhiwu" autocomplete="off" placeholder="职务" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yishengzhuanjia'" class="input-group">
			   <div class="label">工龄</div>
			   <div class="input-container">
			     <input v-model="ruleForm.gongling" class="input" type="text" placeholder="工龄">
			   </div>
			 </div> -->
			<el-form-item label="工龄" class="input" v-if="tableName=='yishengzhuanjia'">
			  <el-input v-model="ruleForm.gongling" autocomplete="off" placeholder="工龄" type="text" />
			</el-form-item>
																																	<!-- <div v-if="tableName=='shiweijiwei'" class="input-group">
			   <div class="label">市卫账号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shiweizhanghao" class="input" type="text" placeholder="市卫账号">
			   </div>
			 </div> -->
			<el-form-item label="市卫账号" class="input" v-if="tableName=='shiweijiwei'">
			  <el-input v-model="ruleForm.shiweizhanghao" autocomplete="off" placeholder="市卫账号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='shiweijiwei'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='shiweijiwei'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='shiweijiwei'" class="input-group">
			   <div class="label">昵称</div>
			   <div class="input-container">
			     <input v-model="ruleForm.nicheng" class="input" type="text" placeholder="昵称">
			   </div>
			 </div> -->
			<el-form-item label="昵称" class="input" v-if="tableName=='shiweijiwei'">
			  <el-input v-model="ruleForm.nicheng" autocomplete="off" placeholder="昵称" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='shiweijiwei'" class="input-group">
			   <div class="label">所属城市</div>
			   <div class="input-container">
			     <input v-model="ruleForm.suoshuchengshi" class="input" type="text" placeholder="所属城市">
			   </div>
			 </div> -->
			<el-form-item label="所属城市" class="input" v-if="tableName=='shiweijiwei'">
			  <el-input v-model="ruleForm.suoshuchengshi" autocomplete="off" placeholder="所属城市" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='shiweijiwei'" class="input-group">
			   <div class="label">联系方式</div>
			   <div class="input-container">
			     <input v-model="ruleForm.lianxifangshi" class="input" type="text" placeholder="联系方式">
			   </div>
			 </div> -->
			<el-form-item label="联系方式" class="input" v-if="tableName=='shiweijiwei'">
			  <el-input v-model="ruleForm.lianxifangshi" autocomplete="off" placeholder="联系方式" type="text" />
			</el-form-item>
																																	<!-- <div v-if="tableName=='shengweijiwei'" class="input-group">
			   <div class="label">省卫账号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shengweizhanghao" class="input" type="text" placeholder="省卫账号">
			   </div>
			 </div> -->
			<el-form-item label="省卫账号" class="input" v-if="tableName=='shengweijiwei'">
			  <el-input v-model="ruleForm.shengweizhanghao" autocomplete="off" placeholder="省卫账号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='shengweijiwei'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='shengweijiwei'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='shengweijiwei'" class="input-group">
			   <div class="label">昵称</div>
			   <div class="input-container">
			     <input v-model="ruleForm.nicheng" class="input" type="text" placeholder="昵称">
			   </div>
			 </div> -->
			<el-form-item label="昵称" class="input" v-if="tableName=='shengweijiwei'">
			  <el-input v-model="ruleForm.nicheng" autocomplete="off" placeholder="昵称" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='shengweijiwei'" class="input-group">
			   <div class="label">所属省份</div>
			   <div class="input-container">
			     <input v-model="ruleForm.suoshushengfen" class="input" type="text" placeholder="所属省份">
			   </div>
			 </div> -->
			<el-form-item label="所属省份" class="input" v-if="tableName=='shengweijiwei'">
			  <el-input v-model="ruleForm.suoshushengfen" autocomplete="off" placeholder="所属省份" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='shengweijiwei'" class="input-group">
			   <div class="label">联系方式</div>
			   <div class="input-container">
			     <input v-model="ruleForm.lianxifangshi" class="input" type="text" placeholder="联系方式">
			   </div>
			 </div> -->
			<el-form-item label="联系方式" class="input" v-if="tableName=='shengweijiwei'">
			  <el-input v-model="ruleForm.lianxifangshi" autocomplete="off" placeholder="联系方式" type="text" />
			</el-form-item>
																																																																		<el-button class="btn" type="primary" @click="login()">注册</el-button>
		</el-form>
      </div>
      <!-- <div class="nk-navigation">
        <a href="#">
          <div @click="login()">注册</div>
        </a>
      </div> -->
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      ruleForm: {
              },
      tableName:"",
      rules: {}
    };
  },
  mounted(){
    let table = this.$storage.get("loginTable");
    this.tableName = table;
  },
  methods: {
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 注册
    login() {
                              if((!this.ruleForm.gonghao) && `yishengzhuanjia` == this.tableName){
        this.$message.error(`工号不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `yishengzhuanjia` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                  if((!this.ruleForm.nicheng) && `yishengzhuanjia` == this.tableName){
        this.$message.error(`昵称不能为空`);
        return
      }
                                                                  if((!this.ruleForm.zhenshixingming) && `yishengzhuanjia` == this.tableName){
        this.$message.error(`真实姓名不能为空`);
        return
      }
                                                                                                                                                                                                                                                                                                                                                                        if(`yishengzhuanjia` == this.tableName && this.ruleForm.lianxifangshi&&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
        this.$message.error(`联系方式应输入手机格式`);
        return
      }
                                                                                                                                                                                                                                                                                                                                                if((!this.ruleForm.shiweizhanghao) && `shiweijiwei` == this.tableName){
        this.$message.error(`市卫账号不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `shiweijiwei` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                  if((!this.ruleForm.nicheng) && `shiweijiwei` == this.tableName){
        this.$message.error(`昵称不能为空`);
        return
      }
                                                                                                                                                if(`shiweijiwei` == this.tableName && this.ruleForm.lianxifangshi&&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
        this.$message.error(`联系方式应输入手机格式`);
        return
      }
                                                                                                                        if((!this.ruleForm.shengweizhanghao) && `shengweijiwei` == this.tableName){
        this.$message.error(`省卫账号不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `shengweijiwei` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                                                                                                                                                      if(`shengweijiwei` == this.tableName && this.ruleForm.lianxifangshi&&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
        this.$message.error(`联系方式应输入手机格式`);
        return
      }
                                                                                                                                                                                          this.$http({
        url: `${this.tableName}/register`,
        method: "post",
        data:this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "注册成功",
            type: "success",
            duration: 1500,
            onClose: () => {
              this.$router.replace({ path: "/login" });
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
	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.h1 {
		margin-top: 10px;
	}

	body {
		padding: 0;
		margin: 0;
	}

	// .container {
 //    min-height: 100vh;
 //    text-align: center;
 //    // background-color: #00c292;
 //    padding-top: 20vh;
 //    background-image: url(../assets/img/bg.jpg);
 //    background-size: 100% 100%;
 //    opacity: 0.9;
 //  }

	// .login-form:before {
	// 	vertical-align: middle;
	// 	display: inline-block;
	// }

	// .login-form {
	// 	max-width: 500px;
	// 	padding: 20px 0;
	// 	width: 80%;
	// 	position: relative;
	// 	margin: 0 auto;

	// 	.label {
	// 		min-width: 60px;
	// 	}

	// 	.input-group {
	// 		max-width: 500px;
	// 		padding: 20px 0;
	// 		width: 80%;
	// 		position: relative;
	// 		margin: 0 auto;
	// 		display: flex;
	// 		align-items: center;

	// 		.input-container {
	// 			display: inline-block;
	// 			width: 100%;
	// 			text-align: left;
	// 			margin-left: 10px;
	// 		}

	// 		.icon {
	// 			width: 30px;
	// 			height: 30px;
	// 		}

	// 		.input {
	// 			position: relative;
	// 			z-index: 2;
	// 			float: left;
	// 			width: 100%;
	// 			margin-bottom: 0;
	// 			box-shadow: none;
	// 			border-top: 0px solid #ccc;
	// 			border-left: 0px solid #ccc;
	// 			border-right: 0px solid #ccc;
	// 			border-bottom: 1px solid #ccc;
	// 			padding: 0px;
	// 			resize: none;
	// 			border-radius: 0px;
	// 			display: block;
	// 			width: 100%;
	// 			height: 34px;
	// 			padding: 6px 12px;
	// 			font-size: 14px;
	// 			line-height: 1.42857143;
	// 			color: #555;
	// 			background-color: #fff;
	// 		}

	// 	}
	// }

	.nk-navigation {
		margin-top: 15px;

		a {
			display: inline-block;
			color: #fff;
			background: rgba(255, 255, 255, .2);
			width: 100px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;
		}

		.icon {
			margin-left: 10px;
			width: 30px;
			height: 30px;
		}
	}

	.register-container {
		margin-top: 10px;

		a {
			display: inline-block;
			color: #fff;
			max-width: 500px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;

			div {
				margin-left: 10px;
			}
		}
	}
	
	.container {
		background-image: url("http://codegen.caihongy.cn/20201124/cbd8317166c749138539adbb367a0313.jpg");
		height: 100vh;
		background-position: center center;
		background-size: cover;
		background-repeat: no-repeat;
	
		.login-form {
			right: 50%;
			top: 50%;
			height: auto;
			transform: translate3d(50%, -50%, 0);
			border-radius: 10px;
			background-color: rgba(255,255,255,.5);
			width: 420px;
			padding: 30px 30px 40px 30px;
			font-size: 14px;
			font-weight: 500;
			
			.h1 {
				margin: 0;
				text-align: center;
				line-height: 54px;
			    font-size: 24px;
			    color: #000;
			}
				
			.rgs-form {
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				
				.input {
					width: 100%;
					
					& /deep/ .el-form-item__label {
						line-height: 40px;
						color: rgba(30, 29, 29, 1);
						font-size: #606266;
					}
					
					& /deep/ .el-input__inner {
						height: 40px;
						color: #606266;
						font-size: 14px;
						border-width: 1px;
						border-style: solid;
						border-color: #606266;
						border-radius: 4px;
						background-color: #fff;
					}
				}
				
				.btn {
					width: 88px;
					height: 44px;
					color: rgba(255, 255, 255, 1);
					font-size: 14px;
					border-width: 1px;
					border-style: solid;
					border-color: rgba(117, 113, 249, 1);
					border-radius: 4px;
					background-color: rgba(117, 113, 249, 1);
				}
			}
		}
	}
</style>
