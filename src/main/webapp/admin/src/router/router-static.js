import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import forum from '@/views/modules/forum/list'
    import news from '@/views/modules/news/list'
    import shenbaoshenhe from '@/views/modules/shenbaoshenhe/list'
    import shengweijiwei from '@/views/modules/shengweijiwei/list'
    import biaozhunxinxi from '@/views/modules/biaozhunxinxi/list'
    import chat from '@/views/modules/chat/list'
    import yishengzhuanjia from '@/views/modules/yishengzhuanjia/list'
    import jieguotongbao from '@/views/modules/jieguotongbao/list'
    import shiweijiwei from '@/views/modules/shiweijiwei/list'
    import config from '@/views/modules/config/list'
    import zizhushenbao from '@/views/modules/zizhushenbao/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/forum',
        name: '系统论坛',
        component: forum
      }
          ,{
	path: '/news',
        name: '系统公告',
        component: news
      }
          ,{
	path: '/shenbaoshenhe',
        name: '申报审核',
        component: shenbaoshenhe
      }
          ,{
	path: '/shengweijiwei',
        name: '省卫计委',
        component: shengweijiwei
      }
          ,{
	path: '/biaozhunxinxi',
        name: '标准信息',
        component: biaozhunxinxi
      }
          ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
          ,{
	path: '/yishengzhuanjia',
        name: '医生专家',
        component: yishengzhuanjia
      }
          ,{
	path: '/jieguotongbao',
        name: '结果通报',
        component: jieguotongbao
      }
          ,{
	path: '/shiweijiwei',
        name: '市卫计委',
        component: shiweijiwei
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/zizhushenbao',
        name: '自主申报',
        component: zizhushenbao
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
