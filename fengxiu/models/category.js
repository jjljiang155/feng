import {http} from "../utils/http";

class category {




    static async getRootCategory()
    {
        const url = `category/findByParentId/0`
        const  data = await  http.request({url})

        return data
    }
}


export {

    category
}