# Введение в симуляцию

**Симуляция** - имитация поведения системы из реального мира во времени.

Симуляция создает искусственную историю системы, по которой можно делать выводы о характеристиках системы.

Симуляции не следует использовать там, где

- можно справится математическими методами,
- легко поставить эксперимент,
- стоимость симуляции превышает выигрыш,
- нельзя контролировать время,
- нет входных данных,
- нельзя проверить корректность симуляиции,
- когда поведение системы слишком сложно или не определено.

Например, не следует симулировать поведение человеков.


**Система** - группа объектов связанных между собой частым взаимодействием или взаимозависимостью для выполнения какой-то цели.
Важно определить границы системы: что мы считаем частью системы, а что ее окружением. Этот решение зависит от цели изучения.

Основые термины:
- **Entity** - Object of interest in the system.
- **Attribute** - Property of an entity.
- **Activity** - A time period of specified length.
- **System state** - Collection of variables required to describe• System state Collection of variables required to describe
  the system at any time.
- **Event** - An instantaneous occurrence that might change the state of the system.
- **Endogenous** - Activities and Events occurring within the systemsystem.
- **Exogenous** - Activities and Events in the environment (outside the system) that affect the system.

Классификация "Дискретные и непрерывные" сисемы:
- Discrete:  State variables change only at discrete set of points, e.g. jobs in queue, Bank.
- Continuous Systems: State variables change continuously over time, e.g. temperature.

**Модель** - это представление системы с целью её изучения.
- Важно учитывать аспекты системы, которые влияют на решение исследуемой проблемы.
- Следует избегать слишком большой диталезации.

> “The tendency is nearly always toThe tendency is nearly always to simulate too much detail rather than
> too little Thus one should alwaystoo little. Thus, one should always design the model around the
> question to be answered rather thanquestion to be answered rather than imitate the real system exactly.”
>
> Shannon, 1975

> Essentially all models are wrong, but some are useful.
>
> George E.P. Box

Примеры моделей:
- Линейное движение: S = V * T. Интуитивное, но на практике не достижимо.
- Распространение излучения (сложная формула). Не зависит от среды, удобная формула, но в обыденной жизни не применима.
- ISO/OSI Network Model: 7 уровней. Гибкое и абстрактное, но представлено явно.
- Поведение человека и приложения: уровень User/Application (отдельные события взаимодействия), уровень Object (длительное действие), уровень Packet (процесс разбитый на отдельные итерации).

Принципы моделирования:
- Концептуализация модели требует системных знаний (system knowledge), инженерных суждений (engeneering judgement) и инструментов для построения модели.
- Секрет в становлении хорошим разработчиком моделей в понимании потребностей моделирования и имение возможности перемоделировать.
- Процесс моделирования является эволюционным, потому что в процессе моделирования частично открывается новая важная информация.
- Четкое определение проблемы является основным управляющим элементом Model-based подхода решения проблемы.
- При моделировании комбинированных систем аспекты непрерывности системы должны приниматься во внимание раньше аспектов дискретности.
- Модель следует оценивать с точки зрения полезности. С абсолютной точки зрения она не может быть ни хорошей, ни плохой, ни никакой.
- Назначение моделирования - это знания и понимание, не модель.
- Нужно понимать, когда следует моделировать снизу вверх или сверху вниз.
- Важно изучать различные техники моделирования, но еще важнее понимать компромиссы в их выборе.

> A. Alan B. Pritsker, James O. Henriksen, Paul A. Fishwick, Gordon M. Clark, “Principles of Modeling”, Winter Simulation Conference, 1991.

Качества хорошей модели:
- простота
- достоверность
- документация
- эффективность
- проверенность (veried)
- качество реализации (code quality)
- доступность

(Похоже на качества информации)
