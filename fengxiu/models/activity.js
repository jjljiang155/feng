import {http} from "../utils/http";

class activity {

    static   locationA = 'a-2'
    static async getHomeLocationD()
    {
        const url = `activity/findByName/${activity.locationA}`
        const data = await http.request({url:url})

        return data
    }
}


export {
    activity
}