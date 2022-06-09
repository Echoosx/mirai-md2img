## 指令菜单

- `[...]`表示单个参数，`[...]?`表示该参数可缺省，`|`表示或者关系

- `{...}`表示一个或多个参数，之间用`空格`隔开

- `*`表示仅在个别群提供服务

- `[` `]` `{` `}` 在实际使用时不需要输入

- 使用时请留意指令中是否有`空格`存在

| 指令                                                                                            | 描述                                                    |
|:----------------------------------------------------------------------------------------------|:------------------------------------------------------|
| `/mirage`                                                                                     | 生成幻影坦克图片                                              |
| `/ytb-dl [url] [subtitle]?`                                                                   | 下载Youtube视频到群文件 *<br/>`subtitle`为字幕类型，现支持`flag` `mix` |
| `/thumb-dl [url] [width]? [height]?`                                                          | 下载Youtube封面到群文件 *                                     |
| `/ytb-search {keywords}`                                                                      | 搜索Youtube视频 *                                         |
| `搜图[图片]`                                                                                      | 搜索图片来源                                                |
| `查成分 [B站昵称｜uid]`                                                                              | 查询该账号关注的虚拟主播                                          |
| `粉丝牌 [B站昵称｜uid]`                                                                              | 查询该账号拥有的虚拟主播粉丝牌                                       |
| `查梗 {关键词}`                                                                                    | 查询梗的科普内容                                              |
| `点歌 {关键词}`                                                                                    | 返回一个歌曲分享                                              |
| `Nano唱一个 {关键词}`                                                                               | 返回一段歌曲语音                                              |
| `鲁迅说 [text]`                                                                                  | 生成一张鲁迅说`text`的表情包                                     |
| `摸[@xx｜昵称｜图片]`                                                                                | 生成一张摸头GIF                                             |
| `丢[@xx｜昵称]`                                                                                   | 生成一张把某人丢出去的表情包                                        |
| `#ph [text1] [text2]`                                                                         | 生成一个PornHub风格图标                                       |
| `#5k [text1] [text2]`                                                                         | 生成一个五千兆円风格图标                                          |
| `#bw [text] --[filter]?`                                                                      | 为图片底部添加一段黑底白字的文字`text`<br/>`filter`为图片滤镜，现支持`黑白` `怀旧` |
| `#[0-100]`                                                                                    | 为图片添加进度`n%`的滤镜                                        |
| `#love [text]`                                                                                | 生成一张举牌子的表情包                                           |
| `#nokia [text]`                                                                               | 生成一张诺基亚梗图                                             |
| `#msg`                                                                                        | 60s内发送转发消息可以生成消息截图                                    |
| `#erode`                                                                                      | 为图片添加`腐蚀`特效                                           |
| `#marble`                                                                                     | 为图片添加`扭曲`特效                                           |
| `#flash`                                                                                      | 为图片添加`伪闪照`特效                                          |
| `#亲亲[@target]`                                                                                | 生成一张亲亲`target`的动图                                     |
| `#怪兽卡｜陷阱卡｜魔法卡 [@target]`<br>`[名称]?`<br>`{种族}?`<br>`[攻击力]? [防御力]?`<br>`[详细描述]?`                | 为`target`生成一张游戏王卡牌                                    |
| `/help`                                                                                       | 返回本指令提示菜单                                             |

注：以上指令均`不需要`@bot，@bot 只会触发对话AI

## 告知

- 以上指令多数只能在群聊中使用，没有特殊情况请 `不要私聊bot！`
- 不要用 bot 刷屏，也不要尝试将 bot 拉入私人群。你可能会被拉入黑名单
- 如果使用指令无效，可能是服务器正在进行更新维护 <del>(或者是你被拉黑了)</del>
- 如果bot长时间不能正常工作，可以QQ联系管理员 `[NoiR](1399478309)`
- 后续仍会有新功能加入，如果你有好的idea，也可以用上述方式联系我
- 本机器人基于开源框架 `Mirai`，遵循 `AGPLv3` 开源协议，仅做交流学习使用