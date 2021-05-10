import {http} from "../utils/http";

class banner {

     static   locationA = 'b-1'
    static async getbannerA()
    {
        const url = `banner/findByname/${banner.locationA}`
        const data = await  http.request({url:url})

        return data
    }


}


export {
    banner
}