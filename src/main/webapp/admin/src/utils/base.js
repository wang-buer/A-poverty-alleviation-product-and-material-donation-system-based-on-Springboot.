const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmr32rk/",
            name: "ssmr32rk",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmr32rk/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "扶贫产品和扶贫物资捐赠系统"
        } 
    }
}
export default base
