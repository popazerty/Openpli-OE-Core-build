ENIGMA2_PLUGINS_append_sh4 += "\
	kernel-module-block2mtd libcrypto \
	enigma2-plugin-systemplugins-sh4boostercontrol \
	enigma2-plugin-systemplugins-sparkvfdcontrol \
	"

ENIGMA2_PLUGINS_append_spark7162 += "\
	"

DEPENDS += "\
	enigma2-plugin-settings-hans-19e-23e-28e \
	"

ENIGMA2_PLUGINS_remove += "\
	"

# Add enigma2-plugin-extensions-openwebif-extras to replace enigma2-plugin-extensions-openwebif
# Ship some extra stuff with the image like youtube, serviceapp, iptvplayer etc..
ENIGMA2_PLUGINS_append += "\
	enigma2-plugin-extensions-youtube \
	enigma2-plugin-systemplugins-vps \
	"


IMAGE_INSTALL += "\
	enigma2-plugin-skins-simple-gray-hd \
        enigma2-plugin-skins-mx-hq7 \
	"

WIFI_DRIVERS_remove_sh4 = " \
	kernel-module-ath9k-htc \
	kernel-module-carl9170 \
	kernel-module-r8712u \
	kernel-module-r8723au \
	kernel-module-rtl8192cu \
	"

