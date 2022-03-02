// Package weather Oferece previsão do tempo atual para uma localização.
package weather

// CurrentCondition Armazena a condição atual.
var CurrentCondition string
// CurrentLocation Armazena a localização atual.
var CurrentLocation string

// Forecast Imprime dados meteorológicos para uma localização e condição.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
