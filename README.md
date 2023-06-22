Nos solicitan desarrollar el software para un club que se dedica a la organización de eventos
deportivos del siguiente tipo:

a. Natación
b. Ciclismo
c. Pedestrismo (Running)
d. Acuatlon (Combinación entre natación y pedestrismo)
e. Duatlon (Combinación entre pedestrismo y ciclismo)
f. Triattlon (Combinación de las tres diciplinas, natación, ciclismo y pedestrismo)

Para poder participar de los eventos deportivos, primero se tiene que ser socio. Los socios se
identifican unívocamente por el número de socio, y, según la disciplina que realizan, se
requiere conocer determinada información:

 Nadadores: Se desea conocer su estilo preferido (Los estilos son Croll, Espalda, Pecho
y Mariposa).
 Ciclistas: Se desea conocer el tipo de bicicleta que utilizan (De montaña, de ruta o de
triatlón)
 Corredores: Se desea conocer su distancia preferida (5 Km, 10 Km, 21 Km o la Maratón
de 42 Km).

Para este club la seguridad de sus socios es muy importante, en consecuencia, nos encargan
custodiar que el sistema no permita que un deportista no pueda inscribirse en una competencia
para la cual no esté preparado, por tal motivo, para el caso que se intente realizar eso, el sistema
tiene que generar una Excepción (NoEstaPreparado). Un deportista “no está preparado” si por
ejemplo desea participar de un torneo de natación, pero no sabe nadar.
