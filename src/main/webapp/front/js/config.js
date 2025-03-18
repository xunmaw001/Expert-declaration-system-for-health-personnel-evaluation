
var projectName = '卫生人员评审专家申报系统';
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
	name: '我的发布',
	url: '../forum/list-my.html'
},

]


var indexNav = [

{
	name: '标准信息',
	url: './pages/biaozhunxinxi/list.html'
}, 

{
	name: '系统论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '系统公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssm1t53j/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"医生专家","menuJump":"列表","tableName":"yishengzhuanjia"}],"menu":"医生专家管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"市卫计委","menuJump":"列表","tableName":"shiweijiwei"}],"menu":"市卫计委管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"省卫计委","menuJump":"列表","tableName":"shengweijiwei"}],"menu":"省卫计委管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"标准信息","menuJump":"列表","tableName":"biaozhunxinxi"}],"menu":"标准信息管理"},{"child":[{"buttons":["查看","修改","删除","报表"],"menu":"自主申报","menuJump":"列表","tableName":"zizhushenbao"}],"menu":"自主申报管理"},{"child":[{"buttons":["查看","修改","删除","报表"],"menu":"申报审核","menuJump":"列表","tableName":"shenbaoshenhe"}],"menu":"申报审核管理"},{"child":[{"buttons":["查看","修改","删除","报表"],"menu":"结果通报","menuJump":"列表","tableName":"jieguotongbao"}],"menu":"结果通报管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"系统论坛","tableName":"forum"}],"menu":"系统论坛"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"在线客服","tableName":"chat"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"系统公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"标准信息列表","menuJump":"列表","tableName":"biaozhunxinxi"}],"menu":"标准信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"自主申报","menuJump":"列表","tableName":"zizhushenbao"}],"menu":"自主申报管理"},{"child":[{"buttons":["查看"],"menu":"申报审核","menuJump":"列表","tableName":"shenbaoshenhe"}],"menu":"申报审核管理"},{"child":[{"buttons":["查看"],"menu":"结果通报","menuJump":"列表","tableName":"jieguotongbao"}],"menu":"结果通报管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"标准信息列表","menuJump":"列表","tableName":"biaozhunxinxi"}],"menu":"标准信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"医生专家","tableName":"yishengzhuanjia"},{"backMenu":[{"child":[{"buttons":["查看","审核","报表"],"menu":"自主申报","menuJump":"列表","tableName":"zizhushenbao"}],"menu":"自主申报管理"},{"child":[{"buttons":["查看","报表","通报"],"menu":"申报审核","menuJump":"列表","tableName":"shenbaoshenhe"}],"menu":"申报审核管理"},{"child":[{"buttons":["查看","修改","删除","报表"],"menu":"结果通报","menuJump":"列表","tableName":"jieguotongbao"}],"menu":"结果通报管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"标准信息列表","menuJump":"列表","tableName":"biaozhunxinxi"}],"menu":"标准信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"市卫计委","tableName":"shiweijiwei"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"标准信息","menuJump":"列表","tableName":"biaozhunxinxi"}],"menu":"标准信息管理"},{"child":[{"buttons":["查看","报表"],"menu":"自主申报","menuJump":"列表","tableName":"zizhushenbao"}],"menu":"自主申报管理"},{"child":[{"buttons":["查看","报表"],"menu":"申报审核","menuJump":"列表","tableName":"shenbaoshenhe"}],"menu":"申报审核管理"},{"child":[{"buttons":["查看","报表"],"menu":"结果通报","menuJump":"列表","tableName":"jieguotongbao"}],"menu":"结果通报管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"系统公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"标准信息列表","menuJump":"列表","tableName":"biaozhunxinxi"}],"menu":"标准信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"省卫计委","tableName":"shengweijiwei"}]


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
