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
    import discussfupinchanpin from '@/views/modules/discussfupinchanpin/list'
    import fupinchanpin from '@/views/modules/fupinchanpin/list'
    import news from '@/views/modules/news/list'
    import zaixianjuanzeng from '@/views/modules/zaixianjuanzeng/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussfupinwuzi from '@/views/modules/discussfupinwuzi/list'
    import fupinwuzi from '@/views/modules/fupinwuzi/list'
    import messages from '@/views/modules/messages/list'
    import liulantongji from '@/views/modules/liulantongji/list'
    import config from '@/views/modules/config/list'
    import discussfupinxiangmu from '@/views/modules/discussfupinxiangmu/list'
    import fupinxiangmu from '@/views/modules/fupinxiangmu/list'


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
	path: '/discussfupinchanpin',
        name: '扶贫产品评论',
        component: discussfupinchanpin
      }
      ,{
	path: '/fupinchanpin',
        name: '扶贫产品',
        component: fupinchanpin
      }
      ,{
	path: '/news',
        name: '新闻资讯',
        component: news
      }
      ,{
	path: '/zaixianjuanzeng',
        name: '在线捐赠',
        component: zaixianjuanzeng
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discussfupinwuzi',
        name: '扶贫物资评论',
        component: discussfupinwuzi
      }
      ,{
	path: '/fupinwuzi',
        name: '扶贫物资',
        component: fupinwuzi
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/liulantongji',
        name: '浏览统计',
        component: liulantongji
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/discussfupinxiangmu',
        name: '扶贫项目评论',
        component: discussfupinxiangmu
      }
      ,{
	path: '/fupinxiangmu',
        name: '扶贫项目',
        component: fupinxiangmu
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
