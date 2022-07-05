# String-longest-prefix
编写一个函数来查找字符串数组中的最长公共前缀。  如果不存在公共前缀，返回空字符串 ""。来自 leetcode

Main  首先循环找到字符串长度最小的字符串，确定需要循环的次数，也防止了指针溢出（可替代）
      循环每个字符串匹配第一个字符是否一致。
      
Main2 使用了String.startsWith(s) 函数，可直接判断String 是否是以s为前缀的。
