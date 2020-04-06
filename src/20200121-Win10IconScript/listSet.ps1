# 获取列表
$list = Get-Content list.md

## 预设系统值与dll 值
$sys = 'sys'
$dllName = 'dll'
# 每行对象
foreach ($line in $list) {

    # 若为系统标题行 则创建文件夹后进入
    if ( $line.contains('### ')) {

        $sysType = $line.Replace('### ', '')
        md $sysType
        cd $sysType

    } elseif ($line.length -eq 0) {
        # 若为空行 则返回系统目录
        cd ../
    } else {
        # 创建 dll目录 进入
        $dllName = $line.Replace('.dll', '')
        md $dllName
        cd $dllName

        # 循环创建图标文件夹
        for($i = 0; $i -le 500; $i++){

            # 创建文件夹
            md $i
            cd $i

            # 复制ini
            Copy-Item ../../../desktop.ini desktop.ini

                ## 修改内容
                # 文件对象
                $ini = Get-Content desktop.ini
                # 清空文件内容
                clear-content $ini.pspath
                # 赋值替换
                $content = $ini.Replace(".dll,","$dllName.dll,$i")
                # 写入
                Add-content $ini.pspath -Value $content

                # 隐藏文件
                attrib desktop.ini +s +h +r

            # 返回
            cd ../
            # 设置只读
            attrib +r $i
        }
        
        # 循环结束别忘记出来
        cd ../
    }
}
cd ../


#desktop.ini =
    #[.ShellClassInfo]
    #IconResource=C:\WINDOWS\System32\.dll,1
    #[ViewState]
    #Mode=
    #Vid=
    #FolderType=Generic


# list.md =         //需去除第一位井号
        #### Win10
        #ddores.dll
        #imageres.dll
        #mmres.dll
        #dmdskres.dll
        #networkexplorer.dll
        #pnidui.dll
        #sensorscpl.dll
        #setupapi.dll
        #shell32.dll
        #wmploc.dll
        #wpdshext.dll
        #
        #### Win7
        #accessibilitycpl.dll
        #dsuiext.dll
        #gameux.dll
        #ieframe.dll
        #mstscax.dll
        #netcenter.dll
        #
        #### WinXP
        #compstui.dll
        #mmcndmgr.dll
        #moricons.dll
        #pifmgr.dll