import {config} from "../config/config"
import {promisic} from "./promise";
class http{

  static async request({url,data,method='GET'})
  {
    
        const backData = await promisic(wx.request)({
             url: `${config.apiBaseUrl}${url}`,
             data:data,
             method:method
            
             //与下面原生的request函数相比，少了异步回调
         })
         // console.log(backData);
         return backData.data;
  }


}

export {
    http
}