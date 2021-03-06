package cn.kingsgame.log.util;

import java.io.*;

/**
 * LogGenerator
 * 金石日志模拟生成器
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 16/3/11 下午5:00.
 */
public class LogGenerator {

    private String sampleLogFile; // 样例log文件
    private String sampleLog; // 样例log文件内容
    private String sampleEventFile; // 事件log文件
    private String sampleEvent; // 样例事件文件内容

    private String objLogPath; // 目标日志路径
    private String objEventPath; // 目标事件路径

    public LogGenerator() {
        String rootPath = this.getClass().getResource("/").getPath();
        this.sampleLogFile = rootPath + "20160209.log";
        this.sampleEventFile = rootPath + "20160301_13_hk12.event";

        this.objLogPath = "/Users/noprom/Documents/Dev/Spark/servers/node-1/appserver-1/logs/log.log";
        this.objEventPath = "/Users/noprom/Documents/Dev/Spark/servers/node-1/appserver-2/logs/event.log";
    }

    /**
     * 加载样例log内容
     *
     * @return
     */
    public String getSampleLog() {
        if (sampleLog == null) {
            sampleLog = fileContent(sampleLogFile);
        }
        return sampleLog;
    }

    /**
     * 加载样例事件内容
     *
     * @return
     */
    public String getSampleEvent() {
        if (sampleEvent == null) {
            sampleEvent = fileContent(sampleEventFile);
        }
        return sampleEvent;
    }

    public String getObjLogPath() {
        return objLogPath;
    }

    public String getObjEventPath() {
        return objEventPath;
    }

    /**
     * 读取一个文件的内容
     *
     * @param fileName 文件名
     * @return 文件内容
     */
    private String fileContent(String fileName) {
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String str = null;
            while ((str = reader.readLine()) != null) {
                builder.append(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        LogGenerator logGenerator = new LogGenerator();
        String demoLog =
                "31.215.117.191 - - [29/Feb/2016:22:57:25 +0800] \"event.apiv8.com\" \"POST /event.php HTTP/1.1\" \"-\" 200 44 {\\x22silent\\x22:0,\\x22offer_id\\x22:81286,\\x22manuFacturer\\x22:\\x22GFIVE\\x22,\\x22resolution\\x22:\\x22480x800\\x22,\\x22net\\x22:\\x22wifi\\x22,\\x22lang\\x22:\\x22en\\x22,\\x22unkown_source\\x22:\\x221\\x22,\\x22id\\x22:1533,\\x22androidid\\x22:\\x22f8082fe07e7ea44e\\x22,\\x22time\\x22:\\x221456757844\\x22,\\x22mc\\x22:\\x2200:08:22:03:25:4f\\x22,\\x22mem\\x22:\\x22460356\\x22,\\x22sdk\\x22:\\x2219\\x22,\\x22vcode\\x22:\\x221\\x22,\\x22app\\x22:\\x22DollarGetter_lg2\\x22,\\x22os\\x22:\\x221\\x22,\\x22apis\\x22:\\x22F:SP_V:1\\x22,\\x22s_nation\\x22:\\x22ae\\x22,\\x22imei\\x22:\\x22866033023197522\\x22,\\x22zavj8p\\x22:1,\\x22cpu\\x22:\\x221001000\\x22,\\x22versionName\\x22:\\x221.0\\x22,\\x22board\\x22:\\x22Z35\\x22,\\x22nation\\x22:\\x22US\\x22,\\x22operator\\x22:\\x22du\\x22,\\x22product\\x22:\\x22GFIVE President Smart 1\\x22,\\x22device-md5\\x22:\\x22none\\x22,\\x22producer\\x22:\\x22Smart_1\\x22,\\x22brand\\x22:\\x22GFIVE\\x22,\\x22imsi\\x22:\\x22424030202223342\\x22,\\x22uuid\\x22:\\x223ba58ccd-e1ca-477d-a5c9-85608b734e69\\x22,\\x22group\\x22:\\x22km\\x22,\\x22channel\\x22:\\x22kingpin02\\x22} \"Mozilla/5.0 (Linux; U; Android 4.4.2; en-us; GFIVE President Smart 1 Build/KOT49H) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1\" \"31.215.117.191\" \"app=DollarGetter_lg2&imei=866033023197522&mc=00:08:22:03:25:4f&model=-&net=wifi&api=-&vcode=1&channel=kingpin02&device_md5=none&uuid=3ba58ccd-e1ca-477d-a5c9-85608b734e69&imsi=424030202223342&uid=-&resolution=480x800&producer=Smart_1&group=km&androidid=f8082fe07e7ea44e\" \"0.001\" \"0.000\" \"200\"\n" +
                        "103.25.12.30 - - [29/Feb/2016:22:57:25 +0800] \"event.apiv8.com\" \"POST /event.php HTTP/1.1\" \"-\" 200 44 {\\x22manuFacturer\\x22:\\x22GFIVE\\x22,\\x22resolution\\x22:\\x22480x854\\x22,\\x22net\\x22:\\x22mptnet\\x22,\\x22lang\\x22:\\x22en\\x22,\\x22unkown_source\\x22:\\x221\\x22,\\x22androidid\\x22:\\x22a6be4ad0f5af125d\\x22,\\x22time\\x22:\\x221456757876\\x22,\\x22mem\\x22:\\x22475848\\x22,\\x22sdk\\x22:\\x2219\\x22,\\x22vcode\\x22:\\x221\\x22,\\x22app\\x22:\\x22DollarGetter_lg2\\x22,\\x22os\\x22:\\x221\\x22,\\x22apis\\x22:\\x22F:SP_V:1\\x22,\\x22s_nation\\x22:\\x22mm\\x22,\\x22imei\\x22:\\x22863049021214914\\x22,\\x22cpu\\x22:\\x221300000\\x22,\\x22versionName\\x22:\\x221.0\\x22,\\x22board\\x22:\\x22Android\\x22,\\x22nation\\x22:\\x22US\\x22,\\x22operator\\x22:\\x22MPTGSM\\x22,\\x22product\\x22:\\x22GFIVE President A97\\x22,\\x22device-md5\\x22:\\x22none\\x22,\\x22producer\\x22:\\x22Android\\x22,\\x22ears\\x22:1,\\x22brand\\x22:\\x22GFIVE\\x22,\\x22imsi\\x22:\\x22414012030539405\\x22,\\x22uuid\\x22:\\x22ce35343f-2aed-419d-97e3-253a0d00631e\\x22,\\x22group\\x22:\\x22km\\x22,\\x22channel\\x22:\\x22kingpin02\\x22} \"Mozilla/5.0 (Linux; U; Android 4.4.2; en-us; GFIVE President A97 Build/KOT49H) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1\" \"103.25.12.30\" \"app=DollarGetter_lg2&imei=863049021214914&mc=&model=-&net=mptnet&api=-&vcode=1&channel=kingpin02&device_md5=none&uuid=ce35343f-2aed-419d-97e3-253a0d00631e&imsi=414012030539405&uid=-&resolution=480x854&producer=Android&group=km&androidid=a6be4ad0f5af125d\" \"0.028\" \"0.001\" \"200\"\n" +
                        "103.25.12.30 - - [29/Feb/2016:22:57:25 +0800] \"event.apiv8.com\" \"POST /event.php HTTP/1.1\" \"-\" 200 44 {\\x22manuFacturer\\x22:\\x22GFIVE\\x22,\\x22resolution\\x22:\\x22480x854\\x22,\\x22net\\x22:\\x22mptnet\\x22,\\x22lang\\x22:\\x22en\\x22,\\x22unkown_source\\x22:\\x221\\x22,\\x22androidid\\x22:\\x22a6be4ad0f5af125d\\x22,\\x22time\\x22:\\x221456757876\\x22,\\x22mem\\x22:\\x22475848\\x22,\\x22sdk\\x22:\\x2219\\x22,\\x22vcode\\x22:\\x221\\x22,\\x22app\\x22:\\x22DollarGetter_lg2\\x22,\\x22os\\x22:\\x221\\x22,\\x22apis\\x22:\\x22F:SP_V:1\\x22,\\x22s_nation\\x22:\\x22mm\\x22,\\x22imei\\x22:\\x22863049021214914\\x22,\\x22cpu\\x22:\\x221300000\\x22,\\x22versionName\\x22:\\x221.0\\x22,\\x22board\\x22:\\x22Android\\x22,\\x22nation\\x22:\\x22US\\x22,\\x22operator\\x22:\\x22MPTGSM\\x22,\\x22product\\x22:\\x22GFIVE President A97\\x22,\\x22device-md5\\x22:\\x22none\\x22,\\x22producer\\x22:\\x22Android\\x22,\\x22ears\\x22:1,\\x22brand\\x22:\\x22GFIVE\\x22,\\x22imsi\\x22:\\x22414012030539405\\x22,\\x22uuid\\x22:\\x22ce35343f-2aed-419d-97e3-253a0d00631e\\x22,\\x22group\\x22:\\x22km\\x22,\\x22channel\\x22:\\x22kingpin02\\x22} \"Mozilla/5.0 (Linux; U; Android 4.4.2; en-us; GFIVE President A97 Build/KOT49H) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1\" \"103.25.12.30\" \"app=DollarGetter_lg2&imei=863049021214914&mc=&model=-&net=mptnet&api=-&vcode=1&channel=kingpin02&device_md5=none&uuid=ce35343f-2aed-419d-97e3-253a0d00631e&imsi=414012030539405&uid=-&resolution=480x854&producer=Android&group=km&androidid=a6be4ad0f5af125d\" \"0.028\" \"0.001\" \"200\"\n" +
                        "103.25.12.30 - - [29/Feb/2016:22:57:25 +0800] \"event.apiv8.com\" \"POST /event.php HTTP/1.1\" \"-\" 200 44 {\\x22manuFacturer\\x22:\\x22GFIVE\\x22,\\x22resolution\\x22:\\x22480x854\\x22,\\x22net\\x22:\\x22mptnet\\x22,\\x22lang\\x22:\\x22en\\x22,\\x22unkown_source\\x22:\\x221\\x22,\\x22androidid\\x22:\\x22a6be4ad0f5af125d\\x22,\\x22time\\x22:\\x221456757876\\x22,\\x22mem\\x22:\\x22475848\\x22,\\x22sdk\\x22:\\x2219\\x22,\\x22vcode\\x22:\\x221\\x22,\\x22app\\x22:\\x22DollarGetter_lg2\\x22,\\x22os\\x22:\\x221\\x22,\\x22apis\\x22:\\x22F:SP_V:1\\x22,\\x22s_nation\\x22:\\x22mm\\x22,\\x22imei\\x22:\\x22863049021214914\\x22,\\x22cpu\\x22:\\x221300000\\x22,\\x22versionName\\x22:\\x221.0\\x22,\\x22board\\x22:\\x22Android\\x22,\\x22nation\\x22:\\x22US\\x22,\\x22operator\\x22:\\x22MPTGSM\\x22,\\x22product\\x22:\\x22GFIVE President A97\\x22,\\x22device-md5\\x22:\\x22none\\x22,\\x22producer\\x22:\\x22Android\\x22,\\x22ears\\x22:1,\\x22brand\\x22:\\x22GFIVE\\x22,\\x22imsi\\x22:\\x22414012030539405\\x22,\\x22uuid\\x22:\\x22ce35343f-2aed-419d-97e3-253a0d00631e\\x22,\\x22group\\x22:\\x22km\\x22,\\x22channel\\x22:\\x22kingpin02\\x22} \"Mozilla/5.0 (Linux; U; Android 4.4.2; en-us; GFIVE President A97 Build/KOT49H) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1\" \"103.25.12.30\" \"app=DollarGetter_lg2&imei=863049021214914&mc=&model=-&net=mptnet&api=-&vcode=1&channel=kingpin02&device_md5=none&uuid=ce35343f-2aed-419d-97e3-253a0d00631e&imsi=414012030539405&uid=-&resolution=480x854&producer=Android&group=km&androidid=a6be4ad0f5af125d\" \"0.028\" \"0.001\" \"200\"\n" +
                        "103.25.12.30 - - [29/Feb/2016:22:57:25 +0800] \"event.apiv8.com\" \"POST /event.php HTTP/1.1\" \"-\" 200 44 {\\x22manuFacturer\\x22:\\x22GFIVE\\x22,\\x22resolution\\x22:\\x22480x854\\x22,\\x22net\\x22:\\x22mptnet\\x22,\\x22lang\\x22:\\x22en\\x22,\\x22unkown_source\\x22:\\x221\\x22,\\x22androidid\\x22:\\x22a6be4ad0f5af125d\\x22,\\x22time\\x22:\\x221456757876\\x22,\\x22mem\\x22:\\x22475848\\x22,\\x22sdk\\x22:\\x2219\\x22,\\x22vcode\\x22:\\x221\\x22,\\x22app\\x22:\\x22DollarGetter_lg2\\x22,\\x22os\\x22:\\x221\\x22,\\x22apis\\x22:\\x22F:SP_V:1\\x22,\\x22s_nation\\x22:\\x22mm\\x22,\\x22imei\\x22:\\x22863049021214914\\x22,\\x22cpu\\x22:\\x221300000\\x22,\\x22versionName\\x22:\\x221.0\\x22,\\x22board\\x22:\\x22Android\\x22,\\x22nation\\x22:\\x22US\\x22,\\x22operator\\x22:\\x22MPTGSM\\x22,\\x22product\\x22:\\x22GFIVE President A97\\x22,\\x22device-md5\\x22:\\x22none\\x22,\\x22producer\\x22:\\x22Android\\x22,\\x22ears\\x22:1,\\x22brand\\x22:\\x22GFIVE\\x22,\\x22imsi\\x22:\\x22414012030539405\\x22,\\x22uuid\\x22:\\x22ce35343f-2aed-419d-97e3-253a0d00631e\\x22,\\x22group\\x22:\\x22km\\x22,\\x22channel\\x22:\\x22kingpin02\\x22} \"Mozilla/5.0 (Linux; U; Android 4.4.2; en-us; GFIVE President A97 Build/KOT49H) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1\" \"103.25.12.30\" \"app=DollarGetter_lg2&imei=863049021214914&mc=&model=-&net=mptnet&api=-&vcode=1&channel=kingpin02&device_md5=none&uuid=ce35343f-2aed-419d-97e3-253a0d00631e&imsi=414012030539405&uid=-&resolution=480x854&producer=Android&group=km&androidid=a6be4ad0f5af125d\" \"0.028\" \"0.001\" \"200\"\n" +
                        "103.25.12.30 - - [29/Feb/2016:22:57:25 +0800] \"event.apiv8.com\" \"POST /event.php HTTP/1.1\" \"-\" 200 44 {\\x22manuFacturer\\x22:\\x22GFIVE\\x22,\\x22resolution\\x22:\\x22480x854\\x22,\\x22net\\x22:\\x22mptnet\\x22,\\x22lang\\x22:\\x22en\\x22,\\x22unkown_source\\x22:\\x221\\x22,\\x22androidid\\x22:\\x22a6be4ad0f5af125d\\x22,\\x22time\\x22:\\x221456757876\\x22,\\x22mem\\x22:\\x22475848\\x22,\\x22sdk\\x22:\\x2219\\x22,\\x22vcode\\x22:\\x221\\x22,\\x22app\\x22:\\x22DollarGetter_lg2\\x22,\\x22os\\x22:\\x221\\x22,\\x22apis\\x22:\\x22F:SP_V:1\\x22,\\x22s_nation\\x22:\\x22mm\\x22,\\x22imei\\x22:\\x22863049021214914\\x22,\\x22cpu\\x22:\\x221300000\\x22,\\x22versionName\\x22:\\x221.0\\x22,\\x22board\\x22:\\x22Android\\x22,\\x22nation\\x22:\\x22US\\x22,\\x22operator\\x22:\\x22MPTGSM\\x22,\\x22product\\x22:\\x22GFIVE President A97\\x22,\\x22device-md5\\x22:\\x22none\\x22,\\x22producer\\x22:\\x22Android\\x22,\\x22ears\\x22:1,\\x22brand\\x22:\\x22GFIVE\\x22,\\x22imsi\\x22:\\x22414012030539405\\x22,\\x22uuid\\x22:\\x22ce35343f-2aed-419d-97e3-253a0d00631e\\x22,\\x22group\\x22:\\x22km\\x22,\\x22channel\\x22:\\x22kingpin02\\x22} \"Mozilla/5.0 (Linux; U; Android 4.4.2; en-us; GFIVE President A97 Build/KOT49H) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1\" \"103.25.12.30\" \"app=DollarGetter_lg2&imei=863049021214914&mc=&model=-&net=mptnet&api=-&vcode=1&channel=kingpin02&device_md5=none&uuid=ce35343f-2aed-419d-97e3-253a0d00631e&imsi=414012030539405&uid=-&resolution=480x854&producer=Android&group=km&androidid=a6be4ad0f5af125d\" \"0.028\" \"0.001\" \"200\"\n" +
                        "103.25.12.30 - - [29/Feb/2016:22:57:25 +0800] \"event.apiv8.com\" \"POST /event.php HTTP/1.1\" \"-\" 200 44 {\\x22manuFacturer\\x22:\\x22GFIVE\\x22,\\x22resolution\\x22:\\x22480x854\\x22,\\x22net\\x22:\\x22mptnet\\x22,\\x22lang\\x22:\\x22en\\x22,\\x22unkown_source\\x22:\\x221\\x22,\\x22androidid\\x22:\\x22a6be4ad0f5af125d\\x22,\\x22time\\x22:\\x221456757876\\x22,\\x22mem\\x22:\\x22475848\\x22,\\x22sdk\\x22:\\x2219\\x22,\\x22vcode\\x22:\\x221\\x22,\\x22app\\x22:\\x22DollarGetter_lg2\\x22,\\x22os\\x22:\\x221\\x22,\\x22apis\\x22:\\x22F:SP_V:1\\x22,\\x22s_nation\\x22:\\x22mm\\x22,\\x22imei\\x22:\\x22863049021214914\\x22,\\x22cpu\\x22:\\x221300000\\x22,\\x22versionName\\x22:\\x221.0\\x22,\\x22board\\x22:\\x22Android\\x22,\\x22nation\\x22:\\x22US\\x22,\\x22operator\\x22:\\x22MPTGSM\\x22,\\x22product\\x22:\\x22GFIVE President A97\\x22,\\x22device-md5\\x22:\\x22none\\x22,\\x22producer\\x22:\\x22Android\\x22,\\x22ears\\x22:1,\\x22brand\\x22:\\x22GFIVE\\x22,\\x22imsi\\x22:\\x22414012030539405\\x22,\\x22uuid\\x22:\\x22ce35343f-2aed-419d-97e3-253a0d00631e\\x22,\\x22group\\x22:\\x22km\\x22,\\x22channel\\x22:\\x22kingpin02\\x22} \"Mozilla/5.0 (Linux; U; Android 4.4.2; en-us; GFIVE President A97 Build/KOT49H) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1\" \"103.25.12.30\" \"app=DollarGetter_lg2&imei=863049021214914&mc=&model=-&net=mptnet&api=-&vcode=1&channel=kingpin02&device_md5=none&uuid=ce35343f-2aed-419d-97e3-253a0d00631e&imsi=414012030539405&uid=-&resolution=480x854&producer=Android&group=km&androidid=a6be4ad0f5af125d\" \"0.028\" \"0.001\" \"200\"\n" +
                        "103.242.98.192 - - [29/Feb/2016:22:57:25 +0800] \"event.apiv8.com\" \"POST /event.php HTTP/1.1\" \"-\" 200 44 {\\x22manuFacturer\\x22:\\x22alps\\x22,\\x22resolution\\x22:\\x22540x960\\x22,\\x22net\\x22:\\x22ooredoo\\x22,\\x22lang\\x22:\\x22en\\x22,\\x22unkown_source\\x22:\\x221\\x22,\\x22androidid\\x22:\\x22b05d4e3d8e02a29e\\x22,\\x22time\\x22:\\x221456757844\\x22,\\x22mc\\x22:\\x2200:08:22:b0:fe:fb\\x22,\\x22mem\\x22:\\x222096128\\x22,\\x22sdk\\x22:\\x2219\\x22,\\x22vcode\\x22:\\x221\\x22,\\x22os\\x22:\\x221\\x22,\\x22apis\\x22:\\x22F:SP_V:1\\x22,\\x22s_nation\\x22:\\x22mm\\x22,\\x22imei\\x22:\\x22355290000933158\\x22,\\x22cpu\\x22:\\x222300000\\x22,\\x22versionName\\x22:\\x221.0\\x22,\\x22board\\x22:\\x22t831e_ax_jh_leagool\\x22,\\x22nation\\x22:\\x22US\\x22,\\x22operator\\x22:\\x2241405\\x22,\\x22product\\x22:\\x22LEAGOOL G10\\x22,\\x22device-md5\\x22:\\x22none\\x22,\\x22producer\\x22:\\x22t831e_ax_jh_leagool\\x22,\\x22ears\\x22:1,\\x22brand\\x22:\\x22LEAGOOL\\x22,\\x22imsi\\x22:\\x22414051016538026\\x22,\\x22uuid\\x22:\\x2224429421-03f7-49fa-9fd4-757a4d940d86\\x22,\\x22group\\x22:\\x22km\\x22,\\x22channel\\x22:\\x22kikuyu01\\x22} \"Mozilla/5.0 (Linux; U; Android 4.4.5; en-us; LEAGOOL G10 Build/KOT49H) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1\" \"103.242.98.192\" \"app=-&imei=355290000933158&mc=00:08:22:b0:fe:fb&model=-&net=ooredoo&api=-&vcode=1&channel=kikuyu01&device_md5=none&uuid=24429421-03f7-49fa-9fd4-757a4d940d86&imsi=414051016538026&uid=-&resolution=540x960&producer=t831e_ax_jh_leagool&group=km&androidid=b05d4e3d8e02a29e\" \"0.060\" \"0.000\" \"200\"\n" +
                        "197.78.140.21 - - [29/Feb/2016:22:57:25 +0800] \"event.apiv8.com\" \"POST /event.php HTTP/1.1\" \"-\" 200 44 {\\x22manuFacturer\\x22:\\x22SPIRIT\\x22,\\x22resolution\\x22:\\x22480x800\\x22,\\x22net\\x22:\\x22internet\\x22,\\x22lang\\x22:\\x22en\\x22,\\x22unkown_source\\x22:\\x221\\x22,\\x22androidid\\x22:\\x229fb5167b78c15135\\x22,\\x22time\\x22:\\x221456757839\\x22,\\x22mc\\x22:\\x2200:c0:27:a5:98:d1\\x22,\\x22mem\\x22:\\x22464272\\x22,\\x22sdk\\x22:\\x2219\\x22,\\x22vcode\\x22:\\x221\\x22,\\x22app\\x22:\\x22DollarGetter_lg2\\x22,\\x22os\\x22:\\x221\\x22,\\x22apis\\x22:\\x22F:SP_V:1\\x22,\\x22s_nation\\x22:\\x22za\\x22,\\x22imei\\x22:\\x22358501010291800\\x22,\\x22cpu\\x22:\\x221200000\\x22,\\x22versionName\\x22:\\x221.0\\x22,\\x22board\\x22:\\x22sp7731gea\\x22,\\x22nation\\x22:\\x22US\\x22,\\x22operator\\x22:\\x22MTN-SA\\x22,\\x22product\\x22:\\x22SPIRIT\\x22,\\x22eal\\x22:1,\\x22device-md5\\x22:\\x22none\\x22,\\x22producer\\x22:\\x22scx35_sp7731gea_ts18_kechao_welcome\\x22,\\x22brand\\x22:\\x22SPIRIT\\x22,\\x22imsi\\x22:\\x22655103190274044\\x22,\\x22uuid\\x22:\\x22858a89b7-b58b-464b-b340-5c9a40b8d1da\\x22,\\x22group\\x22:\\x22km\\x22,\\x22channel\\x22:\\x22kingpin02\\x22} \"Mozilla/5.0 (Linux; U; Android 4.4.2; en-us; SPIRIT Build/KOT49H) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1\" \"197.78.140.21\" \"app=DollarGetter_lg2&imei=358501010291800&mc=00:c0:27:a5:98:d1&model=-&net=internet&api=-&vcode=1&channel=kingpin02&device_md5=none&uuid=858a89b7-b58b-464b-b340-5c9a40b8d1da&imsi=655103190274044&uid=-&resolution=480x800&producer=scx35_sp7731gea_ts18_kechao_welcome&group=km&androidid=9fb5167b78c15135\" \"0.656\" \"0.000\" \"200\"\n" +
                        "197.78.140.21 - - [29/Feb/2016:22:57:25 +0800] \"event.apiv8.com\" \"POST /event.php HTTP/1.1\" \"-\" 200 44 {\\x22manuFacturer\\x22:\\x22SPIRIT\\x22,\\x22resolution\\x22:\\x22480x800\\x22,\\x22net\\x22:\\x22internet\\x22,\\x22lang\\x22:\\x22en\\x22,\\x22unkown_source\\x22:\\x221\\x22,\\x22androidid\\x22:\\x229fb5167b78c15135\\x22,\\x22time\\x22:\\x221456757839\\x22,\\x22mc\\x22:\\x2200:c0:27:a5:98:d1\\x22,\\x22mem\\x22:\\x22464272\\x22,\\x22sdk\\x22:\\x2219\\x22,\\x22vcode\\x22:\\x221\\x22,\\x22app\\x22:\\x22DollarGetter_lg2\\x22,\\x22os\\x22:\\x221\\x22,\\x22apis\\x22:\\x22F:SP_V:1\\x22,\\x22s_nation\\x22:\\x22za\\x22,\\x22imei\\x22:\\x22358501010291800\\x22,\\x22cpu\\x22:\\x221200000\\x22,\\x22versionName\\x22:\\x221.0\\x22,\\x22board\\x22:\\x22sp7731gea\\x22,\\x22nation\\x22:\\x22US\\x22,\\x22operator\\x22:\\x22MTN-SA\\x22,\\x22product\\x22:\\x22SPIRIT\\x22,\\x22eal\\x22:1,\\x22device-md5\\x22:\\x22none\\x22,\\x22producer\\x22:\\x22scx35_sp7731gea_ts18_kechao_welcome\\x22,\\x22brand\\x22:\\x22SPIRIT\\x22,\\x22imsi\\x22:\\x22655103190274044\\x22,\\x22uuid\\x22:\\x22858a89b7-b58b-464b-b340-5c9a40b8d1da\\x22,\\x22group\\x22:\\x22km\\x22,\\x22channel\\x22:\\x22kingpin02\\x22} \"Mozilla/5.0 (Linux; U; Android 4.4.2; en-us; SPIRIT Build/KOT49H) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1\" \"197.78.140.21\" \"app=DollarGetter_lg2&imei=358501010291800&mc=00:c0:27:a5:98:d1&model=-&net=internet&api=-&vcode=1&channel=kingpin02&device_md5=none&uuid=858a89b7-b58b-464b-b340-5c9a40b8d1da&imsi=655103190274044&uid=-&resolution=480x800&producer=scx35_sp7731gea_ts18_kechao_welcome&group=km&androidid=9fb5167b78c15135\" \"0.656\" \"0.000\" \"200\"\n" +
                        "197.78.140.21 - - [29/Feb/2016:22:57:25 +0800] \"event.apiv8.com\" \"POST /event.php HTTP/1.1\" \"-\" 200 44 {\\x22manuFacturer\\x22:\\x22SPIRIT\\x22,\\x22resolution\\x22:\\x22480x800\\x22,\\x22net\\x22:\\x22internet\\x22,\\x22lang\\x22:\\x22en\\x22,\\x22unkown_source\\x22:\\x221\\x22,\\x22androidid\\x22:\\x229fb5167b78c15135\\x22,\\x22time\\x22:\\x221456757839\\x22,\\x22mc\\x22:\\x2200:c0:27:a5:98:d1\\x22,\\x22mem\\x22:\\x22464272\\x22,\\x22sdk\\x22:\\x2219\\x22,\\x22vcode\\x22:\\x221\\x22,\\x22app\\x22:\\x22DollarGetter_lg2\\x22,\\x22os\\x22:\\x221\\x22,\\x22apis\\x22:\\x22F:SP_V:1\\x22,\\x22s_nation\\x22:\\x22za\\x22,\\x22imei\\x22:\\x22358501010291800\\x22,\\x22cpu\\x22:\\x221200000\\x22,\\x22versionName\\x22:\\x221.0\\x22,\\x22board\\x22:\\x22sp7731gea\\x22,\\x22nation\\x22:\\x22US\\x22,\\x22operator\\x22:\\x22MTN-SA\\x22,\\x22product\\x22:\\x22SPIRIT\\x22,\\x22eal\\x22:1,\\x22device-md5\\x22:\\x22none\\x22,\\x22producer\\x22:\\x22scx35_sp7731gea_ts18_kechao_welcome\\x22,\\x22brand\\x22:\\x22SPIRIT\\x22,\\x22imsi\\x22:\\x22655103190274044\\x22,\\x22uuid\\x22:\\x22858a89b7-b58b-464b-b340-5c9a40b8d1da\\x22,\\x22group\\x22:\\x22km\\x22,\\x22channel\\x22:\\x22kingpin02\\x22} \"Mozilla/5.0 (Linux; U; Android 4.4.2; en-us; SPIRIT Build/KOT49H) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1\" \"197.78.140.21\" \"app=DollarGetter_lg2&imei=358501010291800&mc=00:c0:27:a5:98:d1&model=-&net=internet&api=-&vcode=1&channel=kingpin02&device_md5=none&uuid=858a89b7-b58b-464b-b340-5c9a40b8d1da&imsi=655103190274044&uid=-&resolution=480x800&producer=scx35_sp7731gea_ts18_kechao_welcome&group=km&androidid=9fb5167b78c15135\" \"0.656\" \"0.000\" \"200\"\n" +
                        "190.8.226.114 - - [29/Feb/2016:22:57:25 +0800] \"event.apiv8.com\" \"POST /event.php HTTP/1.1\" \"-\" 200 44 {\\x22manuFacturer\\x22:\\x22Z3\\x22,\\x22resolution\\x22:\\x22540x960\\x22,\\x22net\\x22:\\x22wifi\\x22,\\x22lang\\x22:\\x22es\\x22,\\x22unkown_source\\x22:\\x221\\x22,\\x22androidid\\x22:\\x2210beb6538baac29c\\x22,\\x22time\\x22:\\x221456754280\\x22,\\x22mc\\x22:\\x2200:1c:b0:68:f2:db\\x22,\\x22mem\\x22:\\x221048576\\x22,\\x22sdk\\x22:\\x2219\\x22,\\x22vcode\\x22:\\x221\\x22,\\x22app\\x22:\\x22DollarGetter_lg2\\x22,\\x22os\\x22:\\x221\\x22,\\x22apis\\x22:\\x22F:SP_V:1\\x22,\\x22s_nation\\x22:\\x22co\\x22,\\x22imei\\x22:\\x22355352911228555\\x22,\\x22cpu\\x22:\\x221203000\\x22,\\x22versionName\\x22:\\x221.0\\x22,\\x22board\\x22:\\x22yuanda72_cwet_kk\\x22,\\x22nation\\x22:\\x22ES\\x22,\\x22operator\\x22:\\x22COMCEL\\x22,\\x22product\\x22:\\x22W1\\x22,\\x22device-md5\\x22:\\x22none\\x22,\\x22producer\\x22:\\x22Z3\\x22,\\x22ears\\x22:1,\\x22brand\\x22:\\x22Z3\\x22,\\x22imsi\\x22:\\x22732101174047086\\x22,\\x22uuid\\x22:\\x22d6649f0a-1c98-4a26-acbe-6e8a94aa6060\\x22,\\x22group\\x22:\\x22km\\x22,\\x22channel\\x22:\\x22kingpin02\\x22} \"Mozilla/5.0 (Linux; U; Android 4.4.4; es-es; W1 Build/KOT49H) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1\" \"190.8.226.114\" \"app=DollarGetter_lg2&imei=355352911228555&mc=00:1c:b0:68:f2:db&model=-&net=wifi&api=-&vcode=1&channel=kingpin02&device_md5=none&uuid=d6649f0a-1c98-4a26-acbe-6e8a94aa6060&imsi=732101174047086&uid=-&resolution=540x960&producer=Z3&group=km&androidid=10beb6538baac29c\" \"0.010\" \"0.001\" \"200\"\n" +
                        "190.8.226.114 - - [29/Feb/2016:22:57:25 +0800] \"event.apiv8.com\" \"POST /event.php HTTP/1.1\" \"-\" 200 44 {\\x22manuFacturer\\x22:\\x22Z3\\x22,\\x22resolution\\x22:\\x22540x960\\x22,\\x22net\\x22:\\x22wifi\\x22,\\x22lang\\x22:\\x22es\\x22,\\x22unkown_source\\x22:\\x221\\x22,\\x22androidid\\x22:\\x2210beb6538baac29c\\x22,\\x22time\\x22:\\x221456754280\\x22,\\x22mc\\x22:\\x2200:1c:b0:68:f2:db\\x22,\\x22mem\\x22:\\x221048576\\x22,\\x22sdk\\x22:\\x2219\\x22,\\x22vcode\\x22:\\x221\\x22,\\x22app\\x22:\\x22DollarGetter_lg2\\x22,\\x22os\\x22:\\x221\\x22,\\x22apis\\x22:\\x22F:SP_V:1\\x22,\\x22s_nation\\x22:\\x22co\\x22,\\x22imei\\x22:\\x22355352911228555\\x22,\\x22cpu\\x22:\\x221203000\\x22,\\x22versionName\\x22:\\x221.0\\x22,\\x22board\\x22:\\x22yuanda72_cwet_kk\\x22,\\x22nation\\x22:\\x22ES\\x22,\\x22operator\\x22:\\x22COMCEL\\x22,\\x22product\\x22:\\x22W1\\x22,\\x22device-md5\\x22:\\x22none\\x22,\\x22producer\\x22:\\x22Z3\\x22,\\x22ears\\x22:1,\\x22brand\\x22:\\x22Z3\\x22,\\x22imsi\\x22:\\x22732101174047086\\x22,\\x22uuid\\x22:\\x22d6649f0a-1c98-4a26-acbe-6e8a94aa6060\\x22,\\x22group\\x22:\\x22km\\x22,\\x22channel\\x22:\\x22kingpin02\\x22} \"Mozilla/5.0 (Linux; U; Android 4.4.4; es-es; W1 Build/KOT49H) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1\" \"190.8.226.114\" \"app=DollarGetter_lg2&imei=355352911228555&mc=00:1c:b0:68:f2:db&model=-&net=wifi&api=-&vcode=1&channel=kingpin02&device_md5=none&uuid=d6649f0a-1c98-4a26-acbe-6e8a94aa6060&imsi=732101174047086&uid=-&resolution=540x960&producer=Z3&group=km&androidid=10beb6538baac29c\" \"0.010\" \"0.001\" \"200\"";
        String sampleLog =
                demoLog;
                //logGenerator.getSampleLog();
        String sampleEvent = logGenerator.getSampleEvent();
        try {
            FileWriter logWriter = new FileWriter(logGenerator.getObjLogPath());
            FileWriter eventWriter = new FileWriter(logGenerator.getObjEventPath());
            while (true) {
                logWriter.write(sampleLog + "\n");
                eventWriter.write(sampleEvent + "\n");

                System.out.println(sampleLog);
                System.out.println(sampleEvent);
                logWriter.flush();
                eventWriter.flush();
                Thread.sleep(1000);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}