/*
 * This is an Android user space port of DVB-T Linux kernel modules.
 *
 * Copyright (C) 2017 Martin Marinov <martintzvetomirov at gmail com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package info.martinmarinov.drivers.usb;

@SuppressWarnings({"unused", "SpellCheckingInspection"})
public class DvbUsbIds {
    /* Vendor IDs */
    public static final int USB_VID_ADSTECH = 0x06e1;
    public static final int USB_VID_AFATECH = 0x15a4;
    public static final int USB_VID_ALCOR_MICRO = 0x058f;
    public static final int USB_VID_ALINK = 0x05e3;
    public static final int USB_VID_AMT = 0x1c73;
    public static final int USB_VID_ANCHOR = 0x0547;
    public static final int USB_VID_ANSONIC = 0x10b9;
    public static final int USB_VID_ANUBIS_ELECTRONIC = 0x10fd;
    public static final int USB_VID_ASUS = 0x0b05;
    public static final int USB_VID_AVERMEDIA = 0x07ca;
    public static final int USB_VID_COMPRO = 0x185b;
    public static final int USB_VID_COMPRO_UNK = 0x145f;
    public static final int USB_VID_CONEXANT = 0x0572;
    public static final int USB_VID_CYPRESS = 0x04b4;
    public static final int USB_VID_DEXATEK = 0x1d19;
    public static final int USB_VID_DIBCOM = 0x10b8;
    public static final int USB_VID_DPOSH = 0x1498;
    public static final int USB_VID_DVICO = 0x0fe9;
    public static final int USB_VID_E3C = 0x18b4;
    public static final int USB_VID_ELGATO = 0x0fd9;
    public static final int USB_VID_EMPIA = 0xeb1a;
    public static final int USB_VID_GENPIX = 0x09c0;
    public static final int USB_VID_GRANDTEC = 0x5032;
    public static final int USB_VID_GTEK = 0x1f4d;
    public static final int USB_VID_HANFTEK = 0x15f4;
    public static final int USB_VID_HAUPPAUGE = 0x2040;
    public static final int USB_VID_HYPER_PALTEK = 0x1025;
    public static final int USB_VID_INTEL = 0x8086;
    public static final int USB_VID_ITETECH = 0x048d;
    public static final int USB_VID_KWORLD = 0xeb2a;
    public static final int USB_VID_KWORLD_2 = 0x1b80;
    public static final int USB_VID_KYE = 0x0458;
    public static final int USB_VID_LEADTEK = 0x0413;
    public static final int USB_VID_LITEON = 0x04ca;
    public static final int USB_VID_MEDION = 0x1660;
    public static final int USB_VID_MIGLIA = 0x18f3;
    public static final int USB_VID_MSI = 0x0db0;
    public static final int USB_VID_MSI_2 = 0x1462;
    public static final int USB_VID_OPERA1 = 0x695c;
    public static final int USB_VID_PINNACLE = 0x2304;
    public static final int USB_VID_PCTV = 0x2013;
    public static final int USB_VID_PIXELVIEW = 0x1554;
    public static final int USB_VID_REALTEK = 0x0bda;
    public static final int USB_VID_TECHNOTREND = 0x0b48;
    public static final int USB_VID_TERRATEC = 0x0ccd;
    public static final int USB_VID_TELESTAR = 0x10b9;
    public static final int USB_VID_VISIONPLUS = 0x13d3;
    public static final int USB_VID_SONY = 0x1415;
    public static final int USB_VID_TWINHAN = 0x1822;
    public static final int USB_VID_ULTIMA_ELECTRONIC = 0x05d8;
    public static final int USB_VID_UNIWILL = 0x1584;
    public static final int USB_VID_WIDEVIEW = 0x14aa;
    public static final int USB_VID_GIGABYTE = 0x1044;
    public static final int USB_VID_YUAN = 0x1164;
    public static final int USB_VID_XTENSIONS = 0x1ae7;
    public static final int USB_VID_HUMAX_COEX = 0x10b9;
    public static final int USB_VID_774 = 0x7a69;
    public static final int USB_VID_EVOLUTEPC = 0x1e59;
    public static final int USB_VID_AZUREWAVE = 0x13d3;
    public static final int USB_VID_TECHNISAT = 0x14f7;

    /* Product IDs */
    public static final int USB_PID_ADSTECH_USB2_COLD = 0xa333;
    public static final int USB_PID_ADSTECH_USB2_WARM = 0xa334;
    public static final int USB_PID_AFATECH_AF9005 = 0x9020;
    public static final int USB_PID_AFATECH_AF9015_9015 = 0x9015;
    public static final int USB_PID_AFATECH_AF9015_9016 = 0x9016;
    public static final int USB_PID_AFATECH_AF9035_1000 = 0x1000;
    public static final int USB_PID_AFATECH_AF9035_1001 = 0x1001;
    public static final int USB_PID_AFATECH_AF9035_1002 = 0x1002;
    public static final int USB_PID_AFATECH_AF9035_1003 = 0x1003;
    public static final int USB_PID_AFATECH_AF9035_9035 = 0x9035;
    public static final int USB_PID_TREKSTOR_DVBT = 0x901b;
    public static final int USB_PID_TREKSTOR_TERRES_2_0 = 0xC803;
    public static final int USB_VID_ALINK_DTU = 0xf170;
    public static final int USB_PID_ANSONIC_DVBT_USB = 0x6000;
    public static final int USB_PID_ANYSEE = 0x861f;
    public static final int USB_PID_AZUREWAVE_AD_TU700 = 0x3237;
    public static final int USB_PID_AZUREWAVE_6007 = 0x0ccd;
    public static final int USB_PID_AVERMEDIA_DVBT_USB_COLD = 0x0001;
    public static final int USB_PID_AVERMEDIA_DVBT_USB_WARM = 0x0002;
    public static final int USB_PID_AVERMEDIA_DVBT_USB2_COLD = 0xa800;
    public static final int USB_PID_AVERMEDIA_DVBT_USB2_WARM = 0xa801;
    public static final int USB_PID_COMPRO_DVBU2000_COLD = 0xd000;
    public static final int USB_PID_COMPRO_DVBU2000_WARM = 0xd001;
    public static final int USB_PID_COMPRO_DVBU2000_UNK_COLD = 0x010c;
    public static final int USB_PID_COMPRO_DVBU2000_UNK_WARM = 0x010d;
    public static final int USB_PID_COMPRO_VIDEOMATE_U500 = 0x1e78;
    public static final int USB_PID_COMPRO_VIDEOMATE_U500_PC = 0x1e80;
    public static final int USB_PID_CONCEPTRONIC_CTVDIGRCU = 0xe397;
    public static final int USB_PID_CONEXANT_D680_DMB = 0x86d6;
    public static final int USB_PID_CREATIX_CTX1921 = 0x1921;
    public static final int USB_PID_DELOCK_USB2_DVBT = 0xb803;
    public static final int USB_PID_DIBCOM_HOOK_DEFAULT = 0x0064;
    public static final int USB_PID_DIBCOM_HOOK_DEFAULT_REENUM = 0x0065;
    public static final int USB_PID_DIBCOM_MOD3000_COLD = 0x0bb8;
    public static final int USB_PID_DIBCOM_MOD3000_WARM = 0x0bb9;
    public static final int USB_PID_DIBCOM_MOD3001_COLD = 0x0bc6;
    public static final int USB_PID_DIBCOM_MOD3001_WARM = 0x0bc7;
    public static final int USB_PID_DIBCOM_STK7700P = 0x1e14;
    public static final int USB_PID_DIBCOM_STK7700P_PC = 0x1e78;
    public static final int USB_PID_DIBCOM_STK7700D = 0x1ef0;
    public static final int USB_PID_DIBCOM_STK7700_U7000 = 0x7001;
    public static final int USB_PID_DIBCOM_STK7070P = 0x1ebc;
    public static final int USB_PID_DIBCOM_STK7070PD = 0x1ebe;
    public static final int USB_PID_DIBCOM_STK807XP = 0x1f90;
    public static final int USB_PID_DIBCOM_STK807XPVR = 0x1f98;
    public static final int USB_PID_DIBCOM_STK8096GP = 0x1fa0;
    public static final int USB_PID_DIBCOM_NIM8096MD = 0x1fa8;
    public static final int USB_PID_DIBCOM_TFE8096P = 0x1f9C;
    public static final int USB_PID_DIBCOM_ANCHOR_2135_COLD = 0x2131;
    public static final int USB_PID_DIBCOM_STK7770P = 0x1e80;
    public static final int USB_PID_DIBCOM_NIM7090 = 0x1bb2;
    public static final int USB_PID_DIBCOM_TFE7090PVR = 0x1bb4;
    public static final int USB_PID_DIBCOM_TFE7790P = 0x1e6e;
    public static final int USB_PID_DIBCOM_NIM9090M = 0x2383;
    public static final int USB_PID_DIBCOM_NIM9090MD = 0x2384;
    public static final int USB_PID_DPOSH_M9206_COLD = 0x9206;
    public static final int USB_PID_DPOSH_M9206_WARM = 0xa090;
    public static final int USB_PID_E3C_EC168 = 0x1689;
    public static final int USB_PID_E3C_EC168_2 = 0xfffa;
    public static final int USB_PID_E3C_EC168_3 = 0xfffb;
    public static final int USB_PID_E3C_EC168_4 = 0x1001;
    public static final int USB_PID_E3C_EC168_5 = 0x1002;
    public static final int USB_PID_FREECOM_DVBT = 0x0160;
    public static final int USB_PID_FREECOM_DVBT_2 = 0x0161;
    public static final int USB_PID_UNIWILL_STK7700P = 0x6003;
    public static final int USB_PID_GENIUS_TVGO_DVB_T03 = 0x4012;
    public static final int USB_PID_GRANDTEC_DVBT_USB_COLD = 0x0fa0;
    public static final int USB_PID_GRANDTEC_DVBT_USB_WARM = 0x0fa1;
    public static final int USB_PID_INTEL_CE9500 = 0x9500;
    public static final int USB_PID_ITETECH_IT9135 = 0x9135;
    public static final int USB_PID_ITETECH_IT9135_9005 = 0x9005;
    public static final int USB_PID_ITETECH_IT9135_9006 = 0x9006;
    public static final int USB_PID_KWORLD_399U = 0xe399;
    public static final int USB_PID_KWORLD_399U_2 = 0xe400;
    public static final int USB_PID_KWORLD_395U = 0xe396;
    public static final int USB_PID_KWORLD_395U_2 = 0xe39b;
    public static final int USB_PID_KWORLD_395U_3 = 0xe395;
    public static final int USB_PID_KWORLD_395U_4 = 0xe39a;
    public static final int USB_PID_KWORLD_MC810 = 0xc810;
    public static final int USB_PID_KWORLD_PC160_2T = 0xc160;
    public static final int USB_PID_KWORLD_PC160_T = 0xc161;
    public static final int USB_PID_KWORLD_UB383_T = 0xe383;
    public static final int USB_PID_KWORLD_UB499_2T_T09 = 0xe409;
    public static final int USB_PID_KWORLD_VSTREAM_COLD = 0x17de;
    public static final int USB_PID_KWORLD_VSTREAM_WARM = 0x17df;
    public static final int USB_PID_TERRATEC_CINERGY_T_USB_XE = 0x0055;
    public static final int USB_PID_TERRATEC_CINERGY_T_USB_XE_REV2 = 0x0069;
    public static final int USB_PID_TERRATEC_CINERGY_T_STICK = 0x0093;
    public static final int USB_PID_TERRATEC_CINERGY_T_STICK_RC = 0x0097;
    public static final int USB_PID_TERRATEC_CINERGY_T_STICK_DUAL_RC = 0x0099;
    public static final int USB_PID_TERRATEC_CINERGY_T_STICK_BLACK_REV1 = 0x00a9;
    public static final int USB_PID_TWINHAN_VP7041_COLD = 0x3201;
    public static final int USB_PID_TWINHAN_VP7041_WARM = 0x3202;
    public static final int USB_PID_TWINHAN_VP7020_COLD = 0x3203;
    public static final int USB_PID_TWINHAN_VP7020_WARM = 0x3204;
    public static final int USB_PID_TWINHAN_VP7045_COLD = 0x3205;
    public static final int USB_PID_TWINHAN_VP7045_WARM = 0x3206;
    public static final int USB_PID_TWINHAN_VP7021_COLD = 0x3207;
    public static final int USB_PID_TWINHAN_VP7021_WARM = 0x3208;
    public static final int USB_PID_TWINHAN_VP7049 = 0x3219;
    public static final int USB_PID_TINYTWIN = 0x3226;
    public static final int USB_PID_TINYTWIN_2 = 0xe402;
    public static final int USB_PID_TINYTWIN_3 = 0x9016;
    public static final int USB_PID_DNTV_TINYUSB2_COLD = 0x3223;
    public static final int USB_PID_DNTV_TINYUSB2_WARM = 0x3224;
    public static final int USB_PID_ULTIMA_TVBOX_COLD = 0x8105;
    public static final int USB_PID_ULTIMA_TVBOX_WARM = 0x8106;
    public static final int USB_PID_ULTIMA_TVBOX_AN2235_COLD = 0x8107;
    public static final int USB_PID_ULTIMA_TVBOX_AN2235_WARM = 0x8108;
    public static final int USB_PID_ULTIMA_TVBOX_ANCHOR_COLD = 0x2235;
    public static final int USB_PID_ULTIMA_TVBOX_USB2_COLD = 0x8109;
    public static final int USB_PID_ULTIMA_TVBOX_USB2_WARM = 0x810a;
    public static final int USB_PID_ARTEC_T14_COLD = 0x810b;
    public static final int USB_PID_ARTEC_T14_WARM = 0x810c;
    public static final int USB_PID_ARTEC_T14BR = 0x810f;
    public static final int USB_PID_ULTIMA_TVBOX_USB2_FX_COLD = 0x8613;
    public static final int USB_PID_ULTIMA_TVBOX_USB2_FX_WARM = 0x1002;
    public static final int USB_PID_UNK_HYPER_PALTEK_COLD = 0x005e;
    public static final int USB_PID_UNK_HYPER_PALTEK_WARM = 0x005f;
    public static final int USB_PID_HANFTEK_UMT_010_COLD = 0x0001;
    public static final int USB_PID_HANFTEK_UMT_010_WARM = 0x0015;
    public static final int USB_PID_DTT200U_COLD = 0x0201;
    public static final int USB_PID_DTT200U_WARM = 0x0301;
    public static final int USB_PID_WT220U_ZAP250_COLD = 0x0220;
    public static final int USB_PID_WT220U_COLD = 0x0222;
    public static final int USB_PID_WT220U_WARM = 0x0221;
    public static final int USB_PID_WT220U_FC_COLD = 0x0225;
    public static final int USB_PID_WT220U_FC_WARM = 0x0226;
    public static final int USB_PID_WT220U_ZL0353_COLD = 0x022a;
    public static final int USB_PID_WT220U_ZL0353_WARM = 0x022b;
    public static final int USB_PID_WINTV_NOVA_T_USB2_COLD = 0x9300;
    public static final int USB_PID_WINTV_NOVA_T_USB2_WARM = 0x9301;
    public static final int USB_PID_HAUPPAUGE_NOVA_T_500 = 0x9941;
    public static final int USB_PID_HAUPPAUGE_NOVA_T_500_2 = 0x9950;
    public static final int USB_PID_HAUPPAUGE_NOVA_T_500_3 = 0x8400;
    public static final int USB_PID_HAUPPAUGE_NOVA_T_STICK = 0x7050;
    public static final int USB_PID_HAUPPAUGE_NOVA_T_STICK_2 = 0x7060;
    public static final int USB_PID_HAUPPAUGE_NOVA_T_STICK_3 = 0x7070;
    public static final int USB_PID_HAUPPAUGE_MYTV_T = 0x7080;
    public static final int USB_PID_HAUPPAUGE_NOVA_TD_STICK = 0x9580;
    public static final int USB_PID_HAUPPAUGE_NOVA_TD_STICK_52009 = 0x5200;
    public static final int USB_PID_HAUPPAUGE_TIGER_ATSC = 0xb200;
    public static final int USB_PID_HAUPPAUGE_TIGER_ATSC_B210 = 0xb210;
    public static final int USB_PID_AVERMEDIA_EXPRESS = 0xb568;
    public static final int USB_PID_AVERMEDIA_VOLAR = 0xa807;
    public static final int USB_PID_AVERMEDIA_VOLAR_2 = 0xb808;
    public static final int USB_PID_AVERMEDIA_VOLAR_A868R = 0xa868;
    public static final int USB_PID_AVERMEDIA_MCE_USB_M038 = 0x1228;
    public static final int USB_PID_AVERMEDIA_HYBRID_ULTRA_USB_M039R = 0x0039;
    public static final int USB_PID_AVERMEDIA_HYBRID_ULTRA_USB_M039R_ATSC = 0x1039;
    public static final int USB_PID_AVERMEDIA_HYBRID_ULTRA_USB_M039R_DVBT = 0x2039;
    public static final int USB_PID_AVERMEDIA_VOLAR_X = 0xa815;
    public static final int USB_PID_AVERMEDIA_VOLAR_X_2 = 0x8150;
    public static final int USB_PID_AVERMEDIA_A309 = 0xa309;
    public static final int USB_PID_AVERMEDIA_A310 = 0xa310;
    public static final int USB_PID_AVERMEDIA_A850 = 0x850a;
    public static final int USB_PID_AVERMEDIA_A850T = 0x850b;
    public static final int USB_PID_AVERMEDIA_A805 = 0xa805;
    public static final int USB_PID_AVERMEDIA_A815M = 0x815a;
    public static final int USB_PID_AVERMEDIA_A835 = 0xa835;
    public static final int USB_PID_AVERMEDIA_B835 = 0xb835;
    public static final int USB_PID_AVERMEDIA_A835B_1835 = 0x1835;
    public static final int USB_PID_AVERMEDIA_A835B_2835 = 0x2835;
    public static final int USB_PID_AVERMEDIA_A835B_3835 = 0x3835;
    public static final int USB_PID_AVERMEDIA_A835B_4835 = 0x4835;
    public static final int USB_PID_AVERMEDIA_1867 = 0x1867;
    public static final int USB_PID_AVERMEDIA_A867 = 0xa867;
    public static final int USB_PID_AVERMEDIA_TWINSTAR = 0x0825;
    public static final int USB_PID_TECHNOTREND_CONNECT_S2400 = 0x3006;
    public static final int USB_PID_TECHNOTREND_CONNECT_S2400_8KEEPROM = 0x3009;
    public static final int USB_PID_TECHNOTREND_CONNECT_CT3650 = 0x300d;
    public static final int USB_PID_TERRATEC_CINERGY_DT_XS_DIVERSITY = 0x005a;
    public static final int USB_PID_TERRATEC_CINERGY_DT_XS_DIVERSITY_2 = 0x0081;
    public static final int USB_PID_TERRATEC_CINERGY_HT_USB_XE = 0x0058;
    public static final int USB_PID_TERRATEC_CINERGY_HT_EXPRESS = 0x0060;
    public static final int USB_PID_TERRATEC_CINERGY_T_EXPRESS = 0x0062;
    public static final int USB_PID_TERRATEC_CINERGY_T_XXS = 0x0078;
    public static final int USB_PID_TERRATEC_CINERGY_T_XXS_2 = 0x00ab;
    public static final int USB_PID_TERRATEC_H7 = 0x10b4;
    public static final int USB_PID_TERRATEC_H7_2 = 0x10a3;
    public static final int USB_PID_TERRATEC_T3 = 0x10a0;
    public static final int USB_PID_TERRATEC_T5 = 0x10a1;
    public static final int USB_PID_NOXON_DAB_STICK = 0x00b3;
    public static final int USB_PID_NOXON_DAB_STICK_REV2 = 0x00e0;
    public static final int USB_PID_PINNACLE_EXPRESSCARD_320CX = 0x022e;
    public static final int USB_PID_PINNACLE_PCTV2000E = 0x022c;
    public static final int USB_PID_PINNACLE_PCTV_DVB_T_FLASH = 0x0228;
    public static final int USB_PID_PINNACLE_PCTV_DUAL_DIVERSITY_DVB_T = 0x0229;
    public static final int USB_PID_PINNACLE_PCTV71E = 0x022b;
    public static final int USB_PID_PINNACLE_PCTV72E = 0x0236;
    public static final int USB_PID_PINNACLE_PCTV73E = 0x0237;
    public static final int USB_PID_PINNACLE_PCTV310E = 0x3211;
    public static final int USB_PID_PINNACLE_PCTV801E = 0x023a;
    public static final int USB_PID_PINNACLE_PCTV801E_SE = 0x023b;
    public static final int USB_PID_PINNACLE_PCTV340E = 0x023d;
    public static final int USB_PID_PINNACLE_PCTV340E_SE = 0x023e;
    public static final int USB_PID_PINNACLE_PCTV73A = 0x0243;
    public static final int USB_PID_PINNACLE_PCTV73ESE = 0x0245;
    public static final int USB_PID_PINNACLE_PCTV74E = 0x0246;
    public static final int USB_PID_PINNACLE_PCTV282E = 0x0248;
    public static final int USB_PID_PIXELVIEW_SBTVD = 0x5010;
    public static final int USB_PID_PCTV_200E = 0x020e;
    public static final int USB_PID_PCTV_400E = 0x020f;
    public static final int USB_PID_PCTV_450E = 0x0222;
    public static final int USB_PID_PCTV_452E = 0x021f;
    public static final int USB_PID_REALTEK_RTL2831U = 0x2831;
    public static final int USB_PID_REALTEK_RTL2832U = 0x2832;
    public static final int USB_PID_TECHNOTREND_CONNECT_S2_3600 = 0x3007;
    public static final int USB_PID_TECHNOTREND_CONNECT_S2_3650_CI = 0x300a;
    public static final int USB_PID_NEBULA_DIGITV = 0x0201;
    public static final int USB_PID_DVICO_BLUEBIRD_LGDT = 0xd820;
    public static final int USB_PID_DVICO_BLUEBIRD_LG064F_COLD = 0xd500;
    public static final int USB_PID_DVICO_BLUEBIRD_LG064F_WARM = 0xd501;
    public static final int USB_PID_DVICO_BLUEBIRD_LGZ201_COLD = 0xdb00;
    public static final int USB_PID_DVICO_BLUEBIRD_LGZ201_WARM = 0xdb01;
    public static final int USB_PID_DVICO_BLUEBIRD_TH7579_COLD = 0xdb10;
    public static final int USB_PID_DVICO_BLUEBIRD_TH7579_WARM = 0xdb11;
    public static final int USB_PID_DVICO_BLUEBIRD_DUAL_1_COLD = 0xdb50;
    public static final int USB_PID_DVICO_BLUEBIRD_DUAL_1_WARM = 0xdb51;
    public static final int USB_PID_DVICO_BLUEBIRD_DUAL_2_COLD = 0xdb58;
    public static final int USB_PID_DVICO_BLUEBIRD_DUAL_2_WARM = 0xdb59;
    public static final int USB_PID_DVICO_BLUEBIRD_DUAL_4 = 0xdb78;
    public static final int USB_PID_DVICO_BLUEBIRD_DUAL_4_REV_2 = 0xdb98;
    public static final int USB_PID_DVICO_BLUEBIRD_DVB_T_NANO_2 = 0xdb70;
    public static final int USB_PID_DVICO_BLUEBIRD_DVB_T_NANO_2_NFW_WARM = 0xdb71;
    public static final int USB_PID_DIGITALNOW_BLUEBIRD_DUAL_1_COLD = 0xdb54;
    public static final int USB_PID_DIGITALNOW_BLUEBIRD_DUAL_1_WARM = 0xdb55;
    public static final int USB_PID_MEDION_MD95700 = 0x0932;
    public static final int USB_PID_MSI_MEGASKY580 = 0x5580;
    public static final int USB_PID_MSI_MEGASKY580_55801 = 0x5581;
    public static final int USB_PID_KYE_DVB_T_COLD = 0x701e;
    public static final int USB_PID_KYE_DVB_T_WARM = 0x701f;
    public static final int USB_PID_LITEON_DVB_T_COLD = 0xf000;
    public static final int USB_PID_LITEON_DVB_T_WARM = 0xf001;
    public static final int USB_PID_DIGIVOX_MINI_SL_COLD = 0xe360;
    public static final int USB_PID_DIGIVOX_MINI_SL_WARM = 0xe361;
    public static final int USB_PID_GRANDTEC_DVBT_USB2_COLD = 0x0bc6;
    public static final int USB_PID_GRANDTEC_DVBT_USB2_WARM = 0x0bc7;
    public static final int USB_PID_WINFAST_DTV2000DS = 0x6a04;
    public static final int USB_PID_WINFAST_DTV_DONGLE_COLD = 0x6025;
    public static final int USB_PID_WINFAST_DTV_DONGLE_WARM = 0x6026;
    public static final int USB_PID_WINFAST_DTV_DONGLE_STK7700P = 0x6f00;
    public static final int USB_PID_WINFAST_DTV_DONGLE_H = 0x60f6;
    public static final int USB_PID_WINFAST_DTV_DONGLE_STK7700P_2 = 0x6f01;
    public static final int USB_PID_WINFAST_DTV_DONGLE_GOLD = 0x6029;
    public static final int USB_PID_GENPIX_8PSK_REV_1_COLD = 0x0200;
    public static final int USB_PID_GENPIX_8PSK_REV_1_WARM = 0x0201;
    public static final int USB_PID_GENPIX_8PSK_REV_2 = 0x0202;
    public static final int USB_PID_GENPIX_SKYWALKER_1 = 0x0203;
    public static final int USB_PID_GENPIX_SKYWALKER_CW3K = 0x0204;
    public static final int USB_PID_GENPIX_SKYWALKER_2 = 0x0206;
    public static final int USB_PID_SIGMATEK_DVB_110 = 0x6610;
    public static final int USB_PID_MSI_DIGI_VOX_MINI_II = 0x1513;
    public static final int USB_PID_MSI_DIGIVOX_DUO = 0x8801;
    public static final int USB_PID_OPERA1_COLD = 0x2830;
    public static final int USB_PID_OPERA1_WARM = 0x3829;
    public static final int USB_PID_LIFEVIEW_TV_WALKER_TWIN_COLD = 0x0514;
    public static final int USB_PID_LIFEVIEW_TV_WALKER_TWIN_WARM = 0x0513;
    public static final int USB_PID_GIGABYTE_U7000 = 0x7001;
    public static final int USB_PID_GIGABYTE_U8000 = 0x7002;
    public static final int USB_PID_ASUS_U3000 = 0x171f;
    public static final int USB_PID_ASUS_U3000H = 0x1736;
    public static final int USB_PID_ASUS_U3100 = 0x173f;
    public static final int USB_PID_ASUS_U3100MINI_PLUS = 0x1779;
    public static final int USB_PID_YUAN_EC372S = 0x1edc;
    public static final int USB_PID_YUAN_STK7700PH = 0x1f08;
    public static final int USB_PID_YUAN_PD378S = 0x2edc;
    public static final int USB_PID_YUAN_MC770 = 0x0871;
    public static final int USB_PID_YUAN_STK7700D = 0x1efc;
    public static final int USB_PID_YUAN_STK7700D_2 = 0x1e8c;
    public static final int USB_PID_DW2102 = 0x2102;
    public static final int USB_PID_XTENSIONS_XD_380 = 0x0381;
    public static final int USB_PID_TELESTAR_STARSTICK_2 = 0x8000;
    public static final int USB_PID_MSI_DIGI_VOX_MINI_III = 0x8807;
    public static final int USB_PID_SONY_PLAYTV = 0x0003;
    public static final int USB_PID_MYGICA_D689 = 0xd811;
    public static final int USB_PID_ELGATO_EYETV_DIVERSITY = 0x0011;
    public static final int USB_PID_ELGATO_EYETV_DTT = 0x0021;
    public static final int USB_PID_ELGATO_EYETV_DTT_2 = 0x003f;
    public static final int USB_PID_ELGATO_EYETV_DTT_Dlx = 0x0020;
    public static final int USB_PID_ELGATO_EYETV_SAT = 0x002a;
    public static final int USB_PID_DVB_T_USB_STICK_HIGH_SPEED_COLD = 0x5000;
    public static final int USB_PID_DVB_T_USB_STICK_HIGH_SPEED_WARM = 0x5001;
    public static final int USB_PID_FRIIO_WHITE = 0x0001;
    public static final int USB_PID_TVWAY_PLUS = 0x0002;
    public static final int USB_PID_SVEON_STV20 = 0xe39d;
    public static final int USB_PID_SVEON_STV22 = 0xe401;
    public static final int USB_PID_SVEON_STV22_IT9137 = 0xe411;
    public static final int USB_PID_AZUREWAVE_AZ6027 = 0x3275;
    public static final int USB_PID_TERRATEC_DVBS2CI_V1 = 0x10a4;
    public static final int USB_PID_TERRATEC_DVBS2CI_V2 = 0x10ac;
    public static final int USB_PID_TECHNISAT_USB2_HDCI_V1 = 0x0001;
    public static final int USB_PID_TECHNISAT_USB2_HDCI_V2 = 0x0002;
    public static final int USB_PID_TECHNISAT_AIRSTAR_TELESTICK_2 = 0x0004;
    public static final int USB_PID_TECHNISAT_USB2_DVB_S2 = 0x0500;
}
