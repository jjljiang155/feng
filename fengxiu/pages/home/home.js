// pages/home.js



import {http} from "../../utils/http";
import {banner} from "../../models/banner";
import { Theme } from "../../models/theme";
import {category} from "../../models/category";
import {activity} from "../../models/activity";

Page({

  /**
   * 页面的初始数据
   */
  data: {
      themeA:null,
    banner:null,

      categorys:[],
      activity:null,
      themespu:null
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: async function (options) {

    const theme = new Theme()

     await theme.getThemeA()

    const ta = await theme.getlocationA()

     let ba = await banner.getbannerA()

     let ca = await category.getRootCategory()

    let ac = await activity.getHomeLocationD()

    let themspu = await theme.getThemeWithSpu()

    this.setData({
      themeA:ta,
      banner:ba,
      categorys:ca,
      activity:ac,
      themspu:themspu[0]
    })


    console.log(themeA)

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})