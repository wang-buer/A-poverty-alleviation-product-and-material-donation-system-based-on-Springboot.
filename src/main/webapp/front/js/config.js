
var projectName = '扶贫产品和扶贫物资捐赠系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '扶贫项目',
	url: './pages/fupinxiangmu/list.html'
}, 
{
	name: '扶贫物资',
	url: './pages/fupinwuzi/list.html'
}, 
{
	name: '扶贫产品',
	url: './pages/fupinchanpin/list.html'
}, 

{
	name: '新闻资讯',
	url: './pages/news/list.html'
},
{
	name: '留言板',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssmr32rk/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["新增","查看","修改","删除","查看评论"],"menu":"扶贫项目","menuJump":"列表","tableName":"fupinxiangmu"}],"menu":"扶贫项目管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","删除","查看评论"],"menu":"扶贫物资","menuJump":"列表","tableName":"fupinwuzi"}],"menu":"扶贫物资管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除","查看评论"],"menu":"扶贫产品","menuJump":"列表","tableName":"fupinchanpin"}],"menu":"扶贫产品管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","删除"],"menu":"在线捐赠","menuJump":"列表","tableName":"zaixianjuanzeng"}],"menu":"在线捐赠管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除"],"menu":"浏览统计","menuJump":"列表","tableName":"liulantongji"}],"menu":"浏览统计管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"新闻资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看"],"menu":"扶贫项目列表","menuJump":"列表","tableName":"fupinxiangmu"}],"menu":"扶贫项目模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","在线捐赠"],"menu":"扶贫物资列表","menuJump":"列表","tableName":"fupinwuzi"}],"menu":"扶贫物资模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","在线捐赠"],"menu":"扶贫产品列表","menuJump":"列表","tableName":"fupinchanpin"}],"menu":"扶贫产品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","删除"],"menu":"在线捐赠","menuJump":"列表","tableName":"zaixianjuanzeng"}],"menu":"在线捐赠管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看"],"menu":"扶贫项目列表","menuJump":"列表","tableName":"fupinxiangmu"}],"menu":"扶贫项目模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","在线捐赠"],"menu":"扶贫物资列表","menuJump":"列表","tableName":"fupinwuzi"}],"menu":"扶贫物资模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","在线捐赠"],"menu":"扶贫产品列表","menuJump":"列表","tableName":"fupinchanpin"}],"menu":"扶贫产品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
