package com.chenglan.weiyue_kotlin.base

import com.trello.rxlifecycle2.LifecycleTransformer

interface BaseContract {

    interface BasePresenter {
        /**
         * 绑定view
         */
        fun attachView(view: BaseView)

        /**
         * 解绑view
         */
        fun detachView(view: BaseView)
    }

    interface BaseView {
        /**
         * 显示加载页面
         */
        fun showLoding()

        /**
         * 显示页面内容
         */
        fun showSuccess()

        /**
         * 显示错误页面
         */
        fun showError()

        /**
         * 显示无网络页面
         */
        fun showNoNet()

        /**
         * 加载失败重试
         */
        fun onRetry()

        /**
         * 绑定生命周期
         */
        fun <T> bindToLife(): LifecycleTransformer<T>
    }
}