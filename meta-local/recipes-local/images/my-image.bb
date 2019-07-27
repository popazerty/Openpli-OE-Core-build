# This recipe bakes an image close to the old MiLo-image
# It also serves as an example of how you can arrange
# for extra components to be preinstalled while remaining
# compatible with the central repository.

require ../../../meta-openpli/recipes-openpli/images/openpli-enigma2-image.bb

IMAGE_INSTALL += "enigma2-plugin-softcams-oscam \
	enigma2-plugin-extensions-moviecut \
	"
