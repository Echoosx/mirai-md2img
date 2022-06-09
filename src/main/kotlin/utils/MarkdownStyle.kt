package org.echoosx.mirai.plugin.utils

@Suppress("duplicates")
class MarkdownStyle{
    fun getCss(fontsize:Int,isLight:Boolean):String{
        return if(isLight)
            """
            <!DOCTYPE html>
            <html lang="en">
            <head>
              <meta charset="UTF-8">
              <meta http-equiv="X-UA-Compatible" content="IE=edge">
              <meta name="viewport" content="width=device-width, initial-scale=1.0">
              <title>Document</title>
              <style type="text/css">
                body{
                    margin:0;
                    width:max-content;
                }
                .margin-tb-zero,
                .markdown-body ol ol,
                .markdown-body ul ol,
                .markdown-body ol ul,
                .markdown-body ul ul,
                .markdown-body ol ul ol,
                .markdown-body ul ul ol,
                .markdown-body ol ul ul,
                .markdown-body ul ul ul {
                  margin-top: 0;
                  margin-bottom: 0;
                }
                .markdown-body {
                  font-family: "Consolas", "SansSource Han Sans CN", "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
                  font-size: ${fontsize}px;
                  color: #24292f;
                  line-height: 1.6;
                  word-wrap: break-word;
                  padding: 45px;
                  background: #fff;
                  /* border: 1px solid #ddd; */
                  -webkit-border-radius: 0 0 3px 3px;
                  border-radius: 0 0 3px 3px;
                }
                .markdown-body > *:first-child {
                  margin-top: 0 !important;
                }
                .markdown-body > *:last-child {
                  margin-bottom: 0 !important;
                }
                .markdown-body * {
                  -webkit-box-sizing: border-box;
                  -moz-box-sizing: border-box;
                  box-sizing: border-box;
                }
                .markdown-body h1,
                .markdown-body h2,
                .markdown-body h3,
                .markdown-body h4,
                .markdown-body h5,
                .markdown-body h6 {
                  margin-top: 1em;
                  margin-bottom: 16px;
                  font-weight: bold;
                  line-height: 1.4;
                  color: #24292f;
                }
                .markdown-body p,
                .markdown-body blockquote,
                .markdown-body ul,
                .markdown-body ol,
                .markdown-body dl,
                .markdown-body table,
                .markdown-body pre {
                  margin-top: 0;
                  margin-bottom: 16px;
                }
                .markdown-body h1 {
                  margin: 0.67em 0;
                  padding-bottom: 0.3em;
                  font-size: 2.25em;
                  line-height: 1.2;
                  border-bottom: 1px solid #eee;
                }
                .markdown-body h2 {
                  padding-bottom: 0.3em;
                  font-size: 1.75em;
                  line-height: 1.225;
                  /* border-bottom: 1px solid #eee; */
                }
                .markdown-body h3 {
                  font-size: 1.5em;
                  line-height: 1.43;
                }
                .markdown-body h4 {
                  font-size: 1.25em;
                }
                .markdown-body h5 {
                  font-size: 1em;
                }
                .markdown-body h6 {
                  font-size: 1em;
                  color: #777;
                }
                .markdown-body ol,
                .markdown-body ul {
                  padding-left: 2em;
                }
                .markdown-body ol ol,
                .markdown-body ul ol {
                  list-style-type: lower-roman;
                }
                .markdown-body ol ul,
                .markdown-body ul ul {
                  list-style-type: circle;
                }
                .markdown-body ol ul ul,
                .markdown-body ul ul ul {
                  list-style-type: square;
                }
                .markdown-body ol {
                  list-style-type: decimal;
                }
                .markdown-body ul {
                  list-style-type: disc;
                }
                .markdown-body blockquote {
                  margin-left: 0;
                  margin-right: 0;
                  padding: 0 15px;
                  color: #777;
                  border-left: 4px solid #ddd;
                }
                .markdown-body table {
                  display: block;
                  width: 100%;
                  overflow: auto;
                  word-break: normal;
                  word-break: keep-all;
                  border-collapse: collapse;
                  border-spacing: 0;
                }
                .markdown-body table tr {
                  background-color: #fff;
                  border-top: 0.5px solid #d0d7de;
                }
                .markdown-body table tr:nth-child(2n) {
                  background-color: #f6f8fa;
                }
                .markdown-body table th,
                .markdown-body table td {
                  padding: 6px 13px;
                  border: 0.5px solid #d0d7de;
                }
                .markdown-body pre {
                  word-wrap: normal;
                  padding: 16px;
                  overflow: auto;
                  font-size: 85%;
                  line-height: 1.45;
                  background-color: #f7f7f7;
                  -webkit-border-radius: 3px;
                  border-radius: 3px;
                }
                .markdown-body pre code {
                  display: inline;
                  max-width: initial;
                  padding: 0;
                  margin: 0;
                  overflow: initial;
                  font-size: 100%;
                  line-height: inherit;
                  word-wrap: normal;
                  white-space: pre;
                  border: 0;
                  -webkit-border-radius: 3px;
                  border-radius: 3px;
                  background-color: transparent;
                }
                .markdown-body pre code:before,
                .markdown-body pre code:after {
                  content: normal;
                }
                .markdown-body code {
                  font-family: "Consolas", "SansSource Han Sans CN";
                  color: #24292f;
                  padding: 0;
                  padding-top: 0.2em;
                  padding-bottom: 0.2em;
                  font-weight: 500;
                  margin: 0;
                  font-size: 85%;
                  background-color: #e8ebef;
                  -webkit-border-radius: 3px;
                  border-radius: 7px;
                }
                .markdown-body code:before,
                .markdown-body code:after {
                  letter-spacing: -0.2em;
                  content: "\00a0";
                }
                .markdown-body a {
                  color: #4078c0;
                  text-decoration: none;
                  background: transparent;
                }
                .markdown-body img {
                  max-width: 100%;
                  max-height: 100%;
                  -webkit-border-radius: 4px;
                  border-radius: 4px;
                  -webkit-box-shadow: 0 0 10px #555;
                  box-shadow: 0 0 10px #555;
                }
                .markdown-body strong {
                  font-weight: bold;
                }
                .markdown-body em {
                  font-style: italic;
                }
                .markdown-body del {
                  text-decoration: line-through;
                }
                .task-list-item {
                  list-style-type: none;
                }
                .task-list-item input {
                  font: 13px/1.4 "Consolas", "SansSource Han Sans CN", "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
                  margin: 0 0.35em 0.25em -1.6em;
                  vertical-align: middle;
                }
                .task-list-item input[disabled] {
                  cursor: default;
                }
                .task-list-item input[type="checkbox"] {
                  -webkit-box-sizing: border-box;
                  -moz-box-sizing: border-box;
                  box-sizing: border-box;
                  padding: 0;
                }
                .task-list-item input[type="radio"] {
                  -webkit-box-sizing: border-box;
                  -moz-box-sizing: border-box;
                  box-sizing: border-box;
                  padding: 0;
                }
                </style>
            </head>
            <body>
            """
        else
            """
            <!DOCTYPE html>
            <html lang="en">
            <head>
              <meta charset="UTF-8">
              <meta http-equiv="X-UA-Compatible" content="IE=edge">
              <meta name="viewport" content="width=device-width, initial-scale=1.0">
              <title>Document</title>
              <style type="text/css">
                body{
                    margin:0;
                    width:max-content;
                }
                .margin-tb-zero,
                .markdown-body ol ol,
                .markdown-body ul ol,
                .markdown-body ol ul,
                .markdown-body ul ul,
                .markdown-body ol ul ol,
                .markdown-body ul ul ol,
                .markdown-body ol ul ul,
                .markdown-body ul ul ul {
                  margin-top: 0;
                  margin-bottom: 0;
                }
                .markdown-body {
                  font-family: "Consolas", "SansSource Han Sans CN", "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
                  font-size: ${fontsize}px;
                  color: #abb2bf;
                  line-height: 1.6;
                  word-wrap: break-word;
                  padding: 45px;
                  background: #282c34;
                  /* border: 1px solid #ddd; */
                  -webkit-border-radius: 0 0 3px 3px;
                  border-radius: 0 0 3px 3px;
                }
                .markdown-body > *:first-child {
                  margin-top: 0 !important;
                }
                .markdown-body > *:last-child {
                  margin-bottom: 0 !important;
                }
                .markdown-body * {
                  -webkit-box-sizing: border-box;
                  -moz-box-sizing: border-box;
                  box-sizing: border-box;
                }
                .markdown-body h1,
                .markdown-body h2,
                .markdown-body h3,
                .markdown-body h4,
                .markdown-body h5,
                .markdown-body h6 {
                  margin-top: 1em;
                  margin-bottom: 16px;
                  font-weight: bold;
                  line-height: 1.4;
                  color: #fff;
                }
                .markdown-body p,
                .markdown-body blockquote,
                .markdown-body ul,
                .markdown-body ol,
                .markdown-body dl,
                .markdown-body table,
                .markdown-body pre {
                  margin-top: 0;
                  margin-bottom: 16px;
                }
                .markdown-body h1 {
                  margin: 0.67em 0;
                  padding-bottom: 0.3em;
                  font-size: 2.25em;
                  line-height: 1.2;
                  border-bottom: 1px solid #eee;
                }
                .markdown-body h2 {
                  padding-bottom: 0.3em;
                  font-size: 1.75em;
                  line-height: 1.225;
                  /* border-bottom: 1px solid #eee; */
                }
                .markdown-body h3 {
                  font-size: 1.5em;
                  line-height: 1.43;
                }
                .markdown-body h4 {
                  font-size: 1.25em;
                }
                .markdown-body h5 {
                  font-size: 1em;
                }
                .markdown-body h6 {
                  font-size: 1em;
                  color: #777;
                }
                .markdown-body ol,
                .markdown-body ul {
                  padding-left: 2em;
                }
                .markdown-body ol ol,
                .markdown-body ul ol {
                  list-style-type: lower-roman;
                }
                .markdown-body ol ul,
                .markdown-body ul ul {
                  list-style-type: circle;
                }
                .markdown-body ol ul ul,
                .markdown-body ul ul ul {
                  list-style-type: square;
                }
                .markdown-body ol {
                  list-style-type: decimal;
                }
                .markdown-body ul {
                  list-style-type: disc;
                }
                .markdown-body blockquote {
                  margin-left: 0;
                  margin-right: 0;
                  padding: 0 15px;
                  color: #777;
                  border-left: 4px solid #ddd;
                }
                .markdown-body table {
                  display: block;
                  width: 100%;
                  overflow: auto;
                  word-break: normal;
                  word-break: keep-all;
                  border-collapse: collapse;
                  border-spacing: 0;
                }
                .markdown-body table tr {
                  background-color: #282c34;
                  border-top: 0.5px solid #4b5362;
                }
                .markdown-body table tr:nth-child(2n) {
                  background-color: #2d333b;
                }
                .markdown-body table th,
                .markdown-body table td {
                  padding: 6px 13px;
                  border: 0.5px solid #4b5362;
                }
                .markdown-body pre {
                  word-wrap: normal;
                  padding: 16px;
                  overflow: auto;
                  font-size: 85%;
                  line-height: 1.45;
                  background-color: #f7f7f7;
                  -webkit-border-radius: 3px;
                  border-radius: 3px;
                }
                .markdown-body pre code {
                  display: inline;
                  max-width: initial;
                  padding: 0;
                  margin: 0;
                  overflow: initial;
                  font-size: 100%;
                  line-height: inherit;
                  word-wrap: normal;
                  white-space: pre;
                  border: 0;
                  -webkit-border-radius: 3px;
                  border-radius: 3px;
                  background-color: transparent;
                }
                .markdown-body pre code:before,
                .markdown-body pre code:after {
                  content: normal;
                }
                .markdown-body code {
                  font-family: "Consolas", "SansSource Han Sans CN";
                  color: #fff;
                  padding: 0;
                  padding-top: 0.2em;
                  padding-bottom: 0.2em;
                  font-weight: 500;
                  margin: 0;
                  font-size: 85%;
                  background-color: #3a3f4b;
                  -webkit-border-radius: 3px;
                  border-radius: 7px;
                }
                .markdown-body code:before,
                .markdown-body code:after {
                  letter-spacing: -0.2em;
                  content: "\00a0";
                }
                .markdown-body a {
                  color: #4078c0;
                  text-decoration: none;
                  background: transparent;
                }
                .markdown-body img {
                  max-width: 100%;
                  max-height: 100%;
                  -webkit-border-radius: 4px;
                  border-radius: 4px;
                  -webkit-box-shadow: 0 0 10px #555;
                  box-shadow: 0 0 10px #555;
                }
                .markdown-body strong {
                  font-weight: bold;
                }
                .markdown-body em {
                  font-style: italic;
                }
                .markdown-body del {
                  text-decoration: line-through;
                }
                .task-list-item {
                  list-style-type: none;
                }
                .task-list-item input {
                  font: 13px/1.4 "Consolas", "SansSource Han Sans CN", "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
                  margin: 0 0.35em 0.25em -1.6em;
                  vertical-align: middle;
                }
                .task-list-item input[disabled] {
                  cursor: default;
                }
                .task-list-item input[type="checkbox"] {
                  -webkit-box-sizing: border-box;
                  -moz-box-sizing: border-box;
                  box-sizing: border-box;
                  padding: 0;
                }
                .task-list-item input[type="radio"] {
                  -webkit-box-sizing: border-box;
                  -moz-box-sizing: border-box;
                  box-sizing: border-box;
                  padding: 0;
                }
                </style>
            </head>
            <body>
            """
    }
}
