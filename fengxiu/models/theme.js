import { http } from "../utils/http"

class Theme {

    static locationA="t-1"
    static locationB="t-2"
    static locationC="t-3"
    static locationD="t-4"

    themes=[]
     async getThemeA()
    {
         let url = `theme/findByNames/${Theme.locationA},${Theme.locationB},${Theme.locationC},${Theme.locationD}`
         let data = await http.request({url:url})
        this.themes = data
        return data;
    }

     getlocationA()
    {
        return this.themes.find(t => t.name === Theme.locationA)
    }

     async getThemeWithSpu()
    {
        let url = `theme/findByNames/${Theme.locationB}`
        let data = await http.request({url:url})

        return data;
    }


}

export {
    Theme
}