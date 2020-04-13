#ini =
#[.ShellClassInfo]
#IconResource=C:\WINDOWS\System32\shell.dll,1
#[ViewState]
#Mode=
#Vid=
#FolderType=Generic

#$dllName = "wab32res"
$dllName = "windows.storage"
md $dllName
cd $dllName
for($i = -220; $i -le 200; $i++){
    # 创建文件夹
    $f = $dllName + '_' + $i
    md $f

    # 复制图标文件
    Copy-Item ../desktop.ini $f/desktop.ini

    # 进入文件夹
    cd $f

    ## 修改内容
    # 文件对象
    $ini = Get-Content desktop.ini
    # 清空文件内容
    clear-content $ini.pspath
    # 赋值替换
    $content = $ini.Replace(".dll,", "$dllName.dll,$i")
    # 写入
    Add-content $ini.pspath -Value $content

    # 隐藏文件
    attrib desktop.ini +s +h +r
    # 返回
    cd ../
    # 设置只读
    attrib +r $f
}
cd ../
