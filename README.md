# ScalaFAQ
---
本项目是根据《Programming Scala》、《Scala Cookbook》、《Scala for the Impatient》等书的学习示例进行的提炼总结，还包含了很多Scala的基本知识点和技术细节。希望通过该项目的总结能够及时总结Scala编程遇到的常见问题和解决方法，对Scala语法和应用有更加深入的理解。

感谢jupyter-scala项目让我可以在jupyter notebook上编写Scala程序，并进行交互式的总结。

---
## 基本概念
- [基本知识点1](http://nbviewer.jupyter.org/github/jasonding1354/ScalaFAQ/blob/master/basics/basics1.ipynb)
介绍了偏函数、Future、递归技巧、类型推断、Option类型、参数化类型等几个概念和基本方法
- [基本知识点2](http://nbviewer.jupyter.org/github/jasonding1354/ScalaFAQ/blob/master/basics/basics2.ipynb)
介绍了无参数方法、for推导式、异常处理、惰性求值、枚举、trait等几个概念和方法
[]()

## 模式匹配
- [简单匹配](http://nbviewer.jupyter.org/github/jasonding1354/ScalaFAQ/blob/master/pattern_match/simple_matching.ipynb)
[]()

## 隐式转换
- [隐式参数](http://nbviewer.jupyter.org/github/jasonding1354/ScalaFAQ/blob/master/implicits/implicit_parameter.ipynb)
介绍了有关隐式参数的基本方法和规则
- [隐式转换](http://nbviewer.jupyter.org/github/jasonding1354/ScalaFAQ/blob/master/implicits/implicit_conversion.ipynb)
介绍了隐式转换的基本概念，介绍了Map中的->表达式的隐式转换原理，通过隐式转换为scala.StringContext方法添加新的字符串插入器


## 函数式编程
- [函数式编程初步](http://nbviewer.jupyter.org/github/jasonding1354/ScalaFAQ/blob/master/functional/functional_intro.ipynb)
介绍了函数式编程的一些基本概念，包括匿名函数、闭包、尾递归、偏函数、偏应用函数、柯里化等
-[]()

## 面向对象
- []()

## 类型系统
- [参数化类型与型变标记](http://nbviewer.jupyter.org/github/jasonding1354/ScalaFAQ/blob/master/type_system/parametered_type.ipynb)
介绍了Scala类型系统中的参数化类型以及型变（variance）标记
- [类型边界 ](http://nbviewer.jupyter.org/github/jasonding1354/ScalaFAQ/blob/master/type_system/type_bound.ipynb)
介绍类型边界以及使用类型边界解决型变故障的问题
- [虚类型](http://nbviewer.jupyter.org/github/jasonding1354/ScalaFAQ/blob/master/type_system/phantom_type.ipynb)
介绍了使用虚类型来定义按照一定顺序流程的工作流设计问题的解决方法
- []()


## 并发与Actor
- [actor信息交互过程](http://nbviewer.jupyter.org/github/jasonding1354/ScalaFAQ/blob/master/concurrency/Rendering_Example.ipynb)
该示例模拟了场景渲染过程中驱动actor和绘图actor的信息交互过程


## Scala集合库
- [Scala集合库概况](http://nbviewer.jupyter.org/github/jasonding1354/ScalaFAQ/blob/master/collections/collection_intro.ipynb)
